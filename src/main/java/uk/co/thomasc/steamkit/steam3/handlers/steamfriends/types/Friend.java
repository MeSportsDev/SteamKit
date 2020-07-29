package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendsList;
import com.amelic.steamprotobuf.generated.enums.EFriendRelationship;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * Represents a single friend entry in a client's friendlist.
 */
public class Friend {
    private SteamID steamID;

    private EFriendRelationship relationship;

    public Friend(CMsgClientFriendsList.Friend friend) {
        steamID = new SteamID(friend.getUlfriendid());
        relationship = EFriendRelationship.from(friend.getEfriendrelationship());
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public EFriendRelationship getRelationship() {
        return relationship;
    }
}
