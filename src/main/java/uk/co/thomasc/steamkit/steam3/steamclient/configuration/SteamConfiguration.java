package uk.co.thomasc.steamkit.steam3.steamclient.configuration;

import uk.co.thomasc.steamkit.base.generated.enums.EClientPersonaStateFlag;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;
import uk.co.thomasc.steamkit.steam3.discovery.SmartCMServerList;
import uk.co.thomasc.steamkit.steam3.discovery.provider.IServerListProvider;
import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.webapi.WebAPI;

import java.util.EnumSet;
import java.util.function.Consumer;

/**
 * Configuration object to use.
 * This object should not be mutated after it is passed to one or more {@link SteamClient} objects.
 */
public class SteamConfiguration {

    private final SteamConfigurationState state;

    private SmartCMServerList serverList;

    SteamConfiguration(SteamConfigurationState state) {
        this.state = state;
        this.serverList = new SmartCMServerList(this);
    }

    /**
     * Creates a {@link SteamConfiguration}, allowing for configuration.
     *
     * @param configurator A method which is used to configure the configuration.
     * @return A configuration object.
     */
    public static SteamConfiguration create(Consumer<ISteamConfigurationBuilder> configurator) {
        if (configurator == null) {
            throw new IllegalArgumentException("configurator is null");
        }

        SteamConfigurationBuilder builder = new SteamConfigurationBuilder();

        configurator.accept(builder);

        return builder.build();
    }

    public static SteamConfiguration createDefault() {
        return new SteamConfiguration(SteamConfigurationBuilder.createDefaultState());
    }

    /**
     * @return Whether or not to use the Steam Directory to discover available servers.
     */
    public boolean isAllowDirectoryFetch() {
        return state.isAllowDirectoryFetch();
    }

    /**
     * @return The Steam Cell ID to prioritize when connecting.
     */
    public int getCellID() {
        return state.getCellID();
    }

    /**
     * @return The connection timeout used when connecting to Steam serves.
     */
    public long getConnectionTimeout() {
        return state.getConnectionTimeout();
    }

    /**
     * @return The default persona state flags used when requesting information for a new friend, or when calling <b>SteamFriends.RequestFriendInfo</b> without specifying flags.
     */
    public EnumSet<EClientPersonaStateFlag> getDefaultPersonaStateFlags() {
        return state.getDefaultPersonaStateFlags();
    }

    /**
     * @return The supported protocol types to use when attempting to connect to Steam.
     */
    public EnumSet<ProtocolType> getProtocolTypes() {
        return state.getProtocolTypes();
    }

    /**
     * @return The server list provider to use.
     */
    public IServerListProvider getServerListProvider() {
        return state.getServerListProvider();
    }

    /**
     * @return The Universe to connect to. This should always be {@link EUniverse#Public} unless you work at Valve and are using this internally. If this is you, hello there.
     */
    public EUniverse getUniverse() {
        return state.getUniverse();
    }

    /**
     * @return The base address of the Steam Web API to connect to. Use of "partner.steam-api.com" requires a Partner API key.
     */
    public String getWebAPIBaseAddress() {
        return state.getWebAPIBaseAddress();
    }

    /**
     * @return An API key to be used for authorized requests. Keys can be obtained from https://steamcommunity.com/dev or the Steamworks Partner site.
     */
    public String getWebAPIKey() {
        return state.getWebAPIKey();
    }

    /**
     * @return The server list used for this configuration. If this configuration is used by multiple {@link SteamClient} instances, they all share the server list.
     */
    public SmartCMServerList getServerList() {
        return serverList;
    }

    /**
     * Retrieves a handler capable of interacting with the specified interface on the Web API.
     *
     * @param _interface The interface to retrieve a handler for.
     * @return A {@link WebAPI} object to interact with the Web API.
     */
    public WebAPI getWebAPI(String _interface) {
        return new WebAPI(_interface, getWebAPIKey());
    }
}
