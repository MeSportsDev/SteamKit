package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import com.amelic.steamprotobuf.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * This callback is returned some time after logging onto the network.
 */
public final class LoginKeyCallback extends CallbackMsg {
    /**
     * Gets the login key.
     */
    private final String loginKey;
    /**
     * Gets the unique ID.
     */
    private final int uniqueId;

    public LoginKeyCallback(CMsgClientNewLoginKey.Builder logKey) {
        loginKey = logKey.getLoginKey();
        uniqueId = logKey.getUniqueId();
    }

    /**
     * Gets the login key.
     */
    public String getLoginKey() {
        return this.loginKey;
    }

    /**
     * Gets the unique ID.
     */
    public int getUniqueID() {
        return this.uniqueId;
    }
}
