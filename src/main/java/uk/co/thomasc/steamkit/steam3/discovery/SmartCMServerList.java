package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.steam3.webapi.SteamDirectory;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.*;

/**
 * Smart list of CM servers.
 */
public class SmartCMServerList {

    private final SteamConfiguration configuration;

    private List<ServerInfo> servers = Collections.synchronizedList(new ArrayList<ServerInfo>());

    private Long badConnectionMemoryTimeSpan;

    public SmartCMServerList(SteamConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("configuration is null");
        }

        this.configuration = configuration;
    }

    private void startFetchingServers() throws IOException {
        if (!servers.isEmpty()) {
            return;
        }

        resolveServerList();
    }

    private void resolveServerList() throws IOException {
        DebugLog.writeLine("SmartCMServerList", "Resolving server list");

        List<ServerRecord> endPoints = configuration.getServerListProvider().fetchServerList();
        if (endPoints == null) {
            endPoints = new ArrayList<>();
        }

        if (endPoints.isEmpty() && configuration.isAllowDirectoryFetch()) {
            DebugLog.writeLine("SmartCMServerList", "Server list provider had no entries, will query SteamDirectory");
            endPoints = SteamDirectory.load(configuration);
        }

        DebugLog.writeLine("SmartCMServerList", "Resolved " + endPoints.size() + " servers");
        replaceList(endPoints);
    }

    /**
     * Resets the scores of all servers which has a last bad connection more than {@link SmartCMServerList#badConnectionMemoryTimeSpan} ago.
     */
    public void resetOldScores() {
        if (badConnectionMemoryTimeSpan == null) {
            return;
        }

        final long cutoff = System.currentTimeMillis() - badConnectionMemoryTimeSpan;

        for (ServerInfo serverInfo : servers) {
            if (serverInfo.getLastBadConnection() != null && serverInfo.getLastBadConnection().getTime() < cutoff) {
                serverInfo.setLastBadConnection(null);
            }
        }
    }

    /**
     * Replace the list with a new list of servers provided to us by the Steam servers.
     *
     * @param endPoints The {@link ServerRecord ServerRecords} to use for this {@link SmartCMServerList}.
     */
    public void replaceList(List<ServerRecord> endPoints) {
        if (endPoints == null) {
            throw new IllegalArgumentException("endPoints is null");
        }

        servers.clear();

        for (ServerRecord endPoint : endPoints) {
            addCore(endPoint);
        }

        configuration.getServerListProvider().updateServerList(endPoints);
    }

    private void addCore(ServerRecord endPoint) {
        for (ProtocolType protocol : endPoint.getProtocolTypes()) {
            servers.add(new ServerInfo(endPoint, protocol));
        }
    }

    /**
     * Explicitly resets the known state of all servers.
     */
    public void resetBadServers() {
        for (ServerInfo serverInfo : servers) {
            serverInfo.setLastBadConnection(null);
        }
    }

    public boolean tryMark(InetSocketAddress endPoint, ProtocolType protocolTypes, ServerQuality quality) {
        return tryMark(endPoint, EnumSet.of(protocolTypes), quality);
    }

    public boolean tryMark(InetSocketAddress endPoint, EnumSet<ProtocolType> protocolTypes, ServerQuality quality) {
        List<ServerInfo> serverInfos = new ArrayList<>();
        for (ServerInfo x : servers) {
            if (x.getRecord().getEndpoint().equals(endPoint) && protocolTypes.contains(x.getProtocol())) {
                serverInfos.add(x);
            }
        }

        for (ServerInfo serverInfo : serverInfos) {
            DebugLog.writeLine("SmartCMServerList", "Marking " + serverInfo.getRecord().getEndpoint() + " - " + serverInfo.getProtocol() + " as " + quality);
            markServerCore(serverInfo, quality);
        }

        return serverInfos.size() > 0;
    }

    private void markServerCore(ServerInfo serverInfo, ServerQuality quality) {
        switch (quality) {
            case GOOD:
                serverInfo.setLastBadConnection(null);
                break;
            case BAD:
                serverInfo.setLastBadConnection(new Date());
                break;
        }
    }

    /**
     * Perform the actual score lookup of the server list and return the candidate.
     *
     * @param supportedProtocolTypes The minimum supported {@link ProtocolType} of the server to return.
     * @return An {@link ServerRecord}, or null if the list is empty.
     */
    private ServerRecord getNextServerCandidateInternal(EnumSet<ProtocolType> supportedProtocolTypes) {
        resetOldScores();

        List<ServerInfo> serverInfos = new ArrayList<>();
        for (ServerInfo serverInfo : servers) {
            if (supportedProtocolTypes.contains(serverInfo.getProtocol())) {
                serverInfos.add(serverInfo);
            }
        }

        Collections.sort(serverInfos, new Comparator<ServerInfo>() {
            @Override
            public int compare(ServerInfo o1, ServerInfo o2) {
                if (o1.getLastBadConnection() == null && o2.getLastBadConnection() == null) {
                    return 1;
                }

                if (o1.getLastBadConnection() == null) {
                    return -1;
                }

                if (o2.getLastBadConnection() == null) {
                    return 1;
                }

                return o1.getLastBadConnection().before(o2.getLastBadConnection()) ? -1 : 1;
            }
        });

        if (serverInfos.isEmpty()) {
            return null;
        }

        ServerInfo result = serverInfos.get(0);

        return new ServerRecord(result.getRecord().getEndpoint(), result.getProtocol());
    }

    /**
     * Get the next server in the list.
     *
     * @param supportedProtocolTypes The minimum supported {@link ProtocolType} of the server to return.
     * @return An {@link ServerRecord}, or null if the list is empty.
     */
    public ServerRecord getNextServerCandidate(EnumSet<ProtocolType> supportedProtocolTypes) {
        try {
            startFetchingServers();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return getNextServerCandidateInternal(supportedProtocolTypes);
    }

    /**
     * Get the next server in the list.
     *
     * @param supportedProtocolTypes The minimum supported {@link ProtocolType} of the server to return.
     * @return An {@link ServerRecord}, or null if the list is empty.
     */
    public ServerRecord getNextServerCandidate(ProtocolType supportedProtocolTypes) {
        return getNextServerCandidate(EnumSet.of(supportedProtocolTypes));
    }

    /**
     * Gets the {@link ServerRecord ServerRecords} of all servers in the server list.
     *
     * @return An {@link List} array contains the {@link ServerRecord ServerRecords} of the servers in the list
     */
    public List<ServerRecord> getAllEndPoints() {
        try {
            startFetchingServers();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        List<ServerRecord> serverRecords = new ArrayList<>();

        for (ServerInfo server : servers) {
            ServerRecord record = server.getRecord();
            if (!serverRecords.contains(record)) {
                serverRecords.add(record);
            }
        }

        return serverRecords;
    }

    public long getBadConnectionMemoryTimeSpan() {
        return badConnectionMemoryTimeSpan;
    }

    public void setBadConnectionMemoryTimeSpan(long badConnectionMemoryTimeSpan) {
        this.badConnectionMemoryTimeSpan = badConnectionMemoryTimeSpan;
    }
}
