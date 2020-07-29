package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver2;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

public class ClientPlayingSessionStateCallback extends CallbackMsg {

    private final int playingApp;
    private final boolean playingBlocked;

    public ClientPlayingSessionStateCallback(SteammessagesClientserver2.CMsgClientPlayingSessionState.Builder msg) {
        this.playingApp = msg.getPlayingApp();
        playingBlocked = msg.getPlayingBlocked();
    }

    public int getPlayingApp() {
        return playingApp;
    }

    public boolean isPlayingBlocked() {
        return playingBlocked;
    }
}
