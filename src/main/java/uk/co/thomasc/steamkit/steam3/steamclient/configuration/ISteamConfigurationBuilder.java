package uk.co.thomasc.steamkit.steam3.steamclient.configuration;

import uk.co.thomasc.steamkit.base.generated.enums.EClientPersonaStateFlag;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;
import uk.co.thomasc.steamkit.steam3.discovery.provider.IServerListProvider;

import java.util.EnumSet;

/**
 * Interface to configure a {@link SteamConfiguration} before it is created.
 * A reference to the underlying object should not be live beyond the configurator function's scope.
 */
public interface ISteamConfigurationBuilder {

    /**
     * Configures this {@link SteamConfiguration} for a particular Steam cell.
     *
     * @param cellID The Steam Cell ID to prioritize when connecting.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withCellID(int cellID);

    /**
     * Configures this {@link SteamConfiguration} with a connection timeout.
     *
     * @param connectionTimeout The connection timeout used when connecting to Steam serves.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withConnectionTimeout(long connectionTimeout);

    /**
     * Configures this {@link SteamConfiguration} with the default {@link EClientPersonaStateFlag}s to request from Steam.
     *
     * @param personaStateFlags The default persona state flags used when requesting information for a new friend, or when calling <b>SteamFriends.RequestFriendInfo</b> without specifying flags.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withDefaultPersonaStateFlags(EnumSet<EClientPersonaStateFlag> personaStateFlags);

    /**
     * Configures this {@link SteamConfiguration} with the default {@link EClientPersonaStateFlag}s to request from Steam.
     *
     * @param personaStateFlags The default persona state flags used when requesting information for a new friend, or when calling <b>SteamFriends.RequestFriendInfo</b> without specifying flags.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withDefaultPersonaStateFlags(EClientPersonaStateFlag personaStateFlags);

    /**
     * Configures this {@link SteamConfiguration} to discover available servers.
     *
     * @param allowDirectoryFetch Whether or not to use the Steam Directory to discover available servers.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withDirectoryFetch(boolean allowDirectoryFetch);

    /**
     * Configures how this {@link SteamConfiguration} will be used to connect to Steam.
     *
     * @param protocolTypes The supported protocol types to use when attempting to connect to Steam.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withProtocolTypes(EnumSet<ProtocolType> protocolTypes);

    /**
     * Configures how this {@link SteamConfiguration} will be used to connect to Steam.
     *
     * @param protocolTypes The supported protocol types to use when attempting to connect to Steam.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withProtocolTypes(ProtocolType protocolTypes);

    /**
     * Configures the server list provider for this {@link SteamConfiguration}.
     *
     * @param provider The server list provider to use..
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withServerListProvider(IServerListProvider provider);

    /**
     * Configures the Universe that this {@link SteamConfiguration} belongs to.
     *
     * @param universe The Universe to connect to. This should always be {@link EUniverse#Public} unless you work at Valve and are using this internally. If this is you, hello there.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withUniverse(EUniverse universe);

    /**
     * Configures the Steam Web API address for this {@link SteamConfiguration}.
     *
     * @param baseAddress The base address of the Steam Web API to connect to. Use of "partner.steam-api.com" requires a Partner API Key.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withWebAPIBaseAddress(String baseAddress);

    /**
     * Configures this {@link SteamConfiguration} with a Web API key to attach to requests.
     *
     * @param webApiKey An API key to be used for authorized requests. Keys can be obtained from https://steamcommunity.com/dev or the Steamworks Partner site.
     * @return A builder with modified configuration.
     */
    ISteamConfigurationBuilder withWebAPIKey(String webApiKey);
}
