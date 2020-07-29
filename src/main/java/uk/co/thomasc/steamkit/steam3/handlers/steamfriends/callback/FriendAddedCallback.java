package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientAddFriendResponse;
import com.amelic.steamprotobuf.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired in response to adding a user to your friends list.
 */
public class FriendAddedCallback extends CallbackMsg {
    private EResult result;

    private SteamID steamID;

    private String personaName;

    public FriendAddedCallback(CMsgClientAddFriendResponse.Builder msg) {
        result = EResult.from(msg.getEresult());

        steamID = new SteamID(msg.getSteamIdAdded());

        personaName = msg.getPersonaNameAdded();
    }

    public EResult getResult() {
        return result;
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public String getPersonaName() {
        return personaName;
    }
}
