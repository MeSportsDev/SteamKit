package uk.co.thomasc.steamkit.steam3.handlers.steamapps;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientGameConnectTokens;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientGetAppOwnershipTicket;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientGetAppOwnershipTicketResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientLicenseList;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSAccessTokenRequest;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSAccessTokenResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSChangesSinceRequest;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSChangesSinceResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSProductInfoRequest;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSProductInfoRequest.AppInfo;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSProductInfoRequest.PackageInfo;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientPICSProductInfoResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientCheckAppBetaPassword;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientCheckAppBetaPasswordResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientGetCDNAuthToken;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientGetCDNAuthTokenResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientGetDepotDecryptionKey;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientGetDepotDecryptionKeyResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientRequestFreeLicense;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientRequestFreeLicenseResponse;
import com.amelic.steamprotobuf.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.ClientMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.internal.MsgClientUpdateGuestPassesList;
import uk.co.thomasc.steamkit.base.internal.MsgClientVACBanStatus;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.AppOwnershipTicketCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.CDNAuthTokenCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.CheckAppBetaPasswordCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.ClientPlayingSessionStateCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.DepotKeyCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.FreeLicenseCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.GameConnectTokensCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.GuestPassListCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.LicenseListCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.PICSChangesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.PICSProductInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.PICSTokensCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks.VACStatusCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.types.PICSRequest;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for interacting with apps and packages on the Steam network.
 */
public class SteamApps extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamApps() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientLicenseList, this::handleLicenseList);
        dispatchMap.put(EMsg.ClientRequestFreeLicenseResponse, this::handleFreeLicense);
        dispatchMap.put(EMsg.ClientGameConnectTokens, this::handleGameConnectTokens);
        //dispatchMap.put(EMsg.ClientPlayingSessionState, this::handleClientPlayingSessionState);
        dispatchMap.put(EMsg.ClientConcurrentSessionsBase, this::handleClientPlayingSessionState);
        dispatchMap.put(EMsg.ClientVACBanStatus, this::handleVACBanStatus);
        dispatchMap.put(EMsg.ClientGetAppOwnershipTicketResponse, this::handleAppOwnershipTicketResponse);
        dispatchMap.put(EMsg.ClientGetDepotDecryptionKeyResponse, this::handleDepotKeyResponse);
        dispatchMap.put(EMsg.ClientPICSAccessTokenResponse, this::handlePICSAccessTokenResponse);
        dispatchMap.put(EMsg.ClientPICSChangesSinceResponse, this::handlePICSChangesSinceResponse);
        dispatchMap.put(EMsg.ClientPICSProductInfoResponse, this::handlePICSProductInfoResponse);
        dispatchMap.put(EMsg.ClientUpdateGuestPassesList, this::handleGuestPassList);
        dispatchMap.put(EMsg.ClientGetCDNAuthTokenResponse, this::handleCDNAuthTokenResponse);
        dispatchMap.put(EMsg.ClientCheckAppBetaPasswordResponse, this::handleCheckAppBetaPasswordResponse);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Requests an app ownership ticket for the specified AppID.
     * Results are returned in a {@link AppOwnershipTicketCallback} callback.
     *
     * @param appId The appid to request the ownership ticket of.
     * @return The Job ID of the request. This can be used to find the appropriate {@link AppOwnershipTicketCallback}.
     */
    public JobID getAppOwnershipTicket(int appId) {
        ClientMsgProtobuf<CMsgClientGetAppOwnershipTicket.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientGetAppOwnershipTicket.class, EMsg.ClientGetAppOwnershipTicket);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(appId);

        getClient().send(request);

        return jobID;
    }

    /**
     * Request the depot decryption key for a specified DepotID.
     * Results are returned in a {@link DepotKeyCallback} callback.
     *
     * @param depotId The DepotID to request a decryption key for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link DepotKeyCallback}.
     */
    public JobID getDepotDecryptionKey(int depotId) {
        return getDepotDecryptionKey(depotId, 0);
    }

    /**
     * Request the depot decryption key for a specified DepotID.
     * Results are returned in a {@link DepotKeyCallback} callback.
     *
     * @param depotId The DepotID to request a decryption key for.
     * @param appId   The AppID to request the decryption key for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link DepotKeyCallback}.
     */
    public JobID getDepotDecryptionKey(int depotId, int appId) {
        ClientMsgProtobuf<CMsgClientGetDepotDecryptionKey.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientGetDepotDecryptionKey.class, EMsg.ClientGetDepotDecryptionKey);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setDepotId(depotId);
        request.getBody().setAppId(appId);

        getClient().send(request);

        return jobID;
    }

    /**
     * Request PICS access tokens for an app or package.
     * Results are returned in a {@link PICSTokensCallback} callback.
     *
     * @param app      App id to request access token for.
     * @param _package Package id to request access token for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSTokensCallback}.
     */
    public JobID picsGetAccessTokens(Integer app, Integer _package) {
        List<Integer> apps = new ArrayList<>();
        List<Integer> packages = new ArrayList<>();

        if (app != null) {
            apps.add(app);
        }

        if (_package != null) {
            packages.add(_package);
        }

        return picsGetAccessTokens(apps, packages);
    }

    /**
     * Request PICS access tokens for a list of app ids and package ids
     * Results are returned in a {@link PICSTokensCallback} callback.
     *
     * @param appIds     List of app ids to request access tokens for.
     * @param packageIds List of package ids to request access tokens for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSTokensCallback}.
     */
    public JobID picsGetAccessTokens(Iterable<Integer> appIds, Iterable<Integer> packageIds) {
        ClientMsgProtobuf<CMsgClientPICSAccessTokenRequest.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientPICSAccessTokenRequest.class, EMsg.ClientPICSAccessTokenRequest);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().addAllAppids(appIds);
        request.getBody().addAllPackageids(packageIds);

        getClient().send(request);

        return jobID;
    }

    /**
     * Request changes for apps and packages since a given change number
     * Results are returned in a {@link PICSChangesCallback} callback.
     *
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSChangesCallback}.
     */
    public JobID picsGetChangesSince() {
        return picsGetChangesSince(0, true, false);
    }

    /**
     * Request changes for apps and packages since a given change number
     * Results are returned in a {@link PICSChangesCallback} callback.
     *
     * @param lastChangeNumber Last change number seen.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSChangesCallback}.
     */
    public JobID picsGetChangesSince(int lastChangeNumber) {
        return picsGetChangesSince(lastChangeNumber, true, false);
    }

    /**
     * Request changes for apps and packages since a given change number
     * Results are returned in a {@link PICSChangesCallback} callback.
     *
     * @param lastChangeNumber  Last change number seen.
     * @param sendAppChangeList Whether to send app changes.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSChangesCallback}.
     */
    public JobID picsGetChangesSince(int lastChangeNumber, boolean sendAppChangeList) {
        return picsGetChangesSince(lastChangeNumber, sendAppChangeList, false);
    }

    /**
     * Request changes for apps and packages since a given change number
     * Results are returned in a {@link PICSChangesCallback} callback.
     *
     * @param lastChangeNumber      Last change number seen.
     * @param sendAppChangeList     Whether to send app changes.
     * @param sendPackageChangelist Whether to send package changes.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSChangesCallback}.
     */
    public JobID picsGetChangesSince(int lastChangeNumber, boolean sendAppChangeList, boolean sendPackageChangelist) {
        ClientMsgProtobuf<CMsgClientPICSChangesSinceRequest.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientPICSChangesSinceRequest.class, EMsg.ClientPICSChangesSinceRequest);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setSinceChangeNumber(lastChangeNumber);
        request.getBody().setSendAppInfoChanges(sendAppChangeList);
        request.getBody().setSendPackageInfoChanges(sendPackageChangelist);

        getClient().send(request);

        return jobID;
    }

    /**
     * Request product information for an app or package
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param app      App id requested.
     * @param _package Package id requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Integer app, Integer _package) {
        return picsGetProductInfo(app, _package, true, false);
    }


    /**
     * Request product information for an app or package
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param app        App id requested.
     * @param _package   Package id requested.
     * @param onlyPublic Whether to send only public information.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Integer app, Integer _package, boolean onlyPublic) {
        return picsGetProductInfo(app, _package, onlyPublic, false);
    }

    /**
     * Request product information for an app or package
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param app          App id requested.
     * @param _package     Package id requested.
     * @param onlyPublic   Whether to send only public information.
     * @param metaDataOnly Whether to send only meta data.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Integer app, Integer _package, boolean onlyPublic, boolean metaDataOnly) {
        List<Integer> apps = new ArrayList<>();
        List<Integer> packages = new ArrayList<>();

        if (app != null) {
            apps.add(app);
        }

        if (_package != null) {
            packages.add(_package);
        }

        return picsGetProductInfo(apps, packages, onlyPublic, metaDataOnly);
    }

    /**
     * Request product information for a list of apps or packages
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param apps     List of app ids requested.
     * @param packages List of package ids requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Iterable<Integer> apps, Iterable<Integer> packages) {
        return picsGetProductInfo(apps, packages, true, false);
    }

    /**
     * Request product information for a list of apps or packages
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param apps         List of app ids requested.
     * @param packages     List of package ids requested.
     * @param onlyPublic   Whether to send only public information.
     * @param metaDataOnly Whether to send only meta data.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Iterable<Integer> apps, Iterable<Integer> packages, boolean onlyPublic, boolean metaDataOnly) {
        List<PICSRequest> appRequests = new ArrayList<>();
        List<PICSRequest> packageRequests = new ArrayList<>();

        for (Integer app : apps) {
            appRequests.add(new PICSRequest(app, 0, onlyPublic));
        }

        for (Integer _package : packages) {
            packageRequests.add(new PICSRequest(_package, 0, onlyPublic));
        }

        return picsGetProductInfo(appRequests, packageRequests, metaDataOnly);

    }

    /**
     * Request product information for a list of apps or packages
     * Results are returned in a {@link PICSProductInfoCallback} callback.
     *
     * @param apps         List of {@link PICSRequest} requests for apps.
     * @param packages     List of {@link PICSRequest} requests for packages.
     * @param metaDataOnly Whether to send only meta data.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PICSProductInfoCallback}.
     */
    public JobID picsGetProductInfo(Iterable<PICSRequest> apps, Iterable<PICSRequest> packages, boolean metaDataOnly) {
        if (apps == null) {
            throw new IllegalArgumentException("apps is null");
        }

        if (packages == null) {
            throw new IllegalArgumentException("packages is null");
        }

        ClientMsgProtobuf<CMsgClientPICSProductInfoRequest.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientPICSProductInfoRequest.class, EMsg.ClientPICSProductInfoRequest);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        for (PICSRequest appRequest : apps) {
            AppInfo.Builder appInfo = AppInfo.newBuilder();

            appInfo.setAccessToken(appRequest.getAccessToken());
            appInfo.setAppid(appRequest.getId());
            appInfo.setOnlyPublic(appRequest.isPublic());

            request.getBody().addApps(appInfo);
        }

        for (PICSRequest packageRequest : packages) {
            PackageInfo.Builder packageInfo = PackageInfo.newBuilder();

            packageInfo.setAccessToken(packageRequest.getAccessToken());
            packageInfo.setPackageid(packageRequest.getId());

            request.getBody().addPackages(packageInfo);
        }

        request.getBody().setMetaDataOnly(metaDataOnly);

        getClient().send(request);

        return jobID;
    }

    /**
     * Request product information for an app or package
     * Results are returned in a {@link CDNAuthTokenCallback} callback.
     *
     * @param app      App id requested.
     * @param depot    Depot id requested.
     * @param hostName CDN host name being requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link CDNAuthTokenCallback}.
     */
    public JobID getCDNAuthToken(int app, int depot, String hostName) {
        ClientMsgProtobuf<CMsgClientGetCDNAuthToken.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientGetCDNAuthToken.class, EMsg.ClientGetCDNAuthToken);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(app);
        request.getBody().setDepotId(depot);
        request.getBody().setHostName(hostName);

        getClient().send(request);

        return jobID;
    }


    /**
     * Request a free license for given appid, can be used for free on demand apps
     * Results are returned in a {@link FreeLicenseCallback} callback.
     *
     * @param app The app to request a free license for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link FreeLicenseCallback}.
     */
    public JobID requestFreeLicense(int app) {
        List<Integer> apps = new ArrayList<>();
        apps.add(app);
        return requestFreeLicense(apps);
    }

    /**
     * Request a free license for given appids, can be used for free on demand apps
     * Results are returned in a {@link FreeLicenseCallback} callback.
     *
     * @param apps The apps to request a free license for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link FreeLicenseCallback}.
     */
    public JobID requestFreeLicense(Iterable<Integer> apps) {
        if (apps == null) {
            throw new IllegalArgumentException("apps is null");
        }

        ClientMsgProtobuf<CMsgClientRequestFreeLicense.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientRequestFreeLicense.class, EMsg.ClientRequestFreeLicense);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().addAllAppids(apps);

        getClient().send(request);

        return jobID;
    }

    /**
     * Submit a beta password for a given app to retrieve any betas and their encryption keys.
     * Results are returned in a {@link CheckAppBetaPasswordCallback} callback.
     *
     * @param app      App id requested.
     * @param password Password to check.
     * @return The Job ID of the request. This can be used to find the appropriate {@link CheckAppBetaPasswordCallback}.
     */
    public JobID checkAppBetaPassword(int app, String password) {
        ClientMsgProtobuf<CMsgClientCheckAppBetaPassword.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientCheckAppBetaPassword.class, EMsg.ClientCheckAppBetaPassword);
        JobID jobID = getClient().getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(app);
        request.getBody().setBetapassword(password);

        getClient().send(request);

        return jobID;
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg is null");
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            dispatcher.accept(packetMsg);
        }
    }

    private void handleAppOwnershipTicketResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientGetAppOwnershipTicketResponse.Builder> ticketResponse =
                new ClientMsgProtobuf<>(CMsgClientGetAppOwnershipTicketResponse.class, packetMsg);

        getClient().postCallback(new AppOwnershipTicketCallback(ticketResponse.getTargetJobID(), ticketResponse.getBody()));
    }

    private void handleDepotKeyResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientGetDepotDecryptionKeyResponse.Builder> keyResponse =
                new ClientMsgProtobuf<>(CMsgClientGetDepotDecryptionKeyResponse.class, packetMsg);

        getClient().postCallback(new DepotKeyCallback(keyResponse.getTargetJobID(), keyResponse.getBody()));
    }

    private void handleGameConnectTokens(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientGameConnectTokens.Builder> gcTokens =
                new ClientMsgProtobuf<>(CMsgClientGameConnectTokens.class, packetMsg);

        getClient().postCallback(new GameConnectTokensCallback(gcTokens.getBody()));
    }

    private void handleClientPlayingSessionState(IPacketMsg packetMsg) {
        ClientMsgProtobuf<SteammessagesClientserver2.CMsgClientPlayingSessionState.Builder> gcTokens =
                new ClientMsgProtobuf<>(SteammessagesClientserver2.CMsgClientPlayingSessionState.class, packetMsg);

        getClient().postCallback(new ClientPlayingSessionStateCallback(gcTokens.getBody()));
    }

    private void handleLicenseList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientLicenseList.Builder> licenseList =
                new ClientMsgProtobuf<>(CMsgClientLicenseList.class, packetMsg);

        getClient().postCallback(new LicenseListCallback(licenseList.getBody()));
    }

    private void handleFreeLicense(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientRequestFreeLicenseResponse.Builder> grantedLicenses =
                new ClientMsgProtobuf<>(CMsgClientRequestFreeLicenseResponse.class, packetMsg);

        getClient().postCallback(new FreeLicenseCallback(grantedLicenses.getTargetJobID(), grantedLicenses.getBody()));
    }

    private void handleVACBanStatus(IPacketMsg packetMsg) {
        ClientMsg<MsgClientVACBanStatus> vacStatus =
                new ClientMsg<>(MsgClientVACBanStatus.class, packetMsg);

        getClient().postCallback(new VACStatusCallback(vacStatus.getBody(), vacStatus.getPayload().toByteArray()));
    }

    private void handlePICSAccessTokenResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientPICSAccessTokenResponse.Builder> tokensResponse =
                new ClientMsgProtobuf<>(CMsgClientPICSAccessTokenResponse.class, packetMsg);

        getClient().postCallback(new PICSTokensCallback(tokensResponse.getTargetJobID(), tokensResponse.getBody()));
    }

    private void handlePICSChangesSinceResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientPICSChangesSinceResponse.Builder> changesResponse =
                new ClientMsgProtobuf<>(CMsgClientPICSChangesSinceResponse.class, packetMsg);

        getClient().postCallback(new PICSChangesCallback(changesResponse.getTargetJobID(), changesResponse.getBody()));
    }

    private void handlePICSProductInfoResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientPICSProductInfoResponse.Builder> productResponse =
                new ClientMsgProtobuf<>(CMsgClientPICSProductInfoResponse.class, packetMsg);

        getClient().postCallback(new PICSProductInfoCallback(productResponse.getTargetJobID(), productResponse.getBody()));
    }

    private void handleGuestPassList(IPacketMsg packetMsg) {
        ClientMsg<MsgClientUpdateGuestPassesList> guestPasses =
                new ClientMsg<MsgClientUpdateGuestPassesList>(MsgClientUpdateGuestPassesList.class, packetMsg);

        getClient().postCallback(new GuestPassListCallback(guestPasses.getBody(), guestPasses.getPayload()));
    }

    private void handleCDNAuthTokenResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientGetCDNAuthTokenResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgClientGetCDNAuthTokenResponse.class, packetMsg);

        getClient().postCallback(new CDNAuthTokenCallback(response.getTargetJobID(), response.getBody()));
    }

    private void handleCheckAppBetaPasswordResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientCheckAppBetaPasswordResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgClientCheckAppBetaPasswordResponse.class, packetMsg);

        getClient().postCallback(new CheckAppBetaPasswordCallback(response.getTargetJobID(), response.getBody()));
    }
}
