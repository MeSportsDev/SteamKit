package uk.co.thomasc.steamkit.steam3.handlers.steamtrading.callbacks;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgTrading_StartSession;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired when a trading session has started.
 */
public final class SessionStartCallback extends CallbackMsg {
    /**
     * Gets the SteamID of the client that this the trading session has started
     * with.
     */
    private final SteamID otherClient;

    public SessionStartCallback(CMsgTrading_StartSession.Builder msg) {
        otherClient = new SteamID(msg.getOtherSteamid());
    }

    /**
     * Gets the SteamID of the client that this the trading session has started
     * with.
     */
    public SteamID getOtherClient() {
        return this.otherClient;
    }
}
