package uk.co.thomasc.steamkit.steam3.handlers.steamfriends;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.*;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendMessageHistory;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendMessageHistoryForOfflineMessages;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendMessageHistoryResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendsSteamLevelsResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.*;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.msg.MsgClientSetIgnoreFriend;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.msg.MsgClientSetIgnoreFriendResponse;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callbacks.*;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.AccountCache;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.Clan;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.User;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.JobCallback;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.gameid.GameID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This handler handles all interaction with other users on the Steam3 network.
 */
public final class SteamFriends extends ClientMsgHandler {
    private final Object listLock = new Object();
    private final List<SteamID> friendList;
    private final List<SteamID> clanList;
    public AccountCache cache;

    public SteamFriends() {
        friendList = new ArrayList<SteamID>();
        clanList = new ArrayList<SteamID>();
        cache = new AccountCache();
    }

    /**
     * Gets the local user's persona name.
     *
     * @return The name.
     */
    public String getPersonaName() {
        return cache.getLocalUser().name;
    }

    /**
     * Sets the local user's persona name and broadcasts it over the network.
     *
     * @param name The name.
     */
    public void setPersonaName(String name) {
        // cache the local name right away, so that early calls to SetPersonaState don't reset the set name
        cache.getLocalUser().name = name;
        final ClientMsgProtobuf<CMsgClientChangeStatus.Builder> stateMsg = new ClientMsgProtobuf<CMsgClientChangeStatus.Builder>(CMsgClientChangeStatus.class, EMsg.ClientChangeStatus);
        stateMsg.getBody().setPersonaState(cache.getLocalUser().personaState.v());
        stateMsg.getBody().setPlayerName(name);
        getClient().send(stateMsg);
    }

    /**
     * Gets the local user's persona state.
     *
     * @return The persona state.
     */
    public EPersonaState getPersonaState() {
        return cache.getLocalUser().personaState;
    }

    /**
     * Sets the local user's persona state and broadcasts it over the network.
     *
     * @param state The state.
     */
    public void setPersonaState(EPersonaState state) {
        cache.getLocalUser().personaState = state;
        final ClientMsgProtobuf<CMsgClientChangeStatus.Builder> stateMsg = new ClientMsgProtobuf<CMsgClientChangeStatus.Builder>(CMsgClientChangeStatus.class, EMsg.ClientChangeStatus);
        stateMsg.getBody().setPersonaState(state.v());
        stateMsg.getBody().setPlayerName(cache.getLocalUser().name);
        getClient().send(stateMsg);
    }

    /**
     * Gets the friend count of the local user.
     *
     * @return The number of friends.
     */
    public int getFriendCount() {
        synchronized (listLock) {
            return friendList.size();
        }
    }

    /**
     * Gets a friend by index.
     *
     * @param index The index.
     * @return A valid steamid of a friend if the index is in range; otherwise a
     * steamid representing 0.
     */
    public SteamID getFriendByIndex(int index) {
        synchronized (listLock) {
            if (index < 0 || index >= friendList.size()) {
                return new SteamID();
            }
            return friendList.get(index);
        }
    }

    /**
     * Gets the persona name of a friend.
     *
     * @param steamId The steam id.
     * @return The name.
     */
    public String getFriendPersonaName(SteamID steamId) {
        return cache.getUser(steamId).name;
    }

    /**
     * Gets the nickname/alias of a friend.
     *
     * @param steamId The steam id.
     * @return The nickname.
     */
    public String getFriendNickname(SteamID steamId) {
        return cache.getUser(steamId).nickname;
    }

    /**
     * Gets the persona state of a friend.
     *
     * @param steamId The steam id.
     * @return The persona state.
     */
    public EPersonaState getFriendPersonaState(SteamID steamId) {
        return cache.getUser(steamId).personaState;
    }

    /**
     * Gets the relationship of a friend.
     *
     * @param steamId The steam id.
     * @return The relationship of the friend to the local user.
     */
    public EFriendRelationship getFriendRelationship(SteamID steamId) {
        return cache.getUser(steamId).relationship;
    }

    /**
     * Gets the last time a friend logged off.
     *
     * @param steamId The steam id.
     * @return The unix timestamp representing the last time a friend logged off.
     */
    public long getFriendLastLogoff(SteamID steamId) {
        return cache.getUser(steamId).lastLogoff;
    }

    /**
     * Gets the last time a friend logged on.
     *
     * @param steamId The steam id.
     * @return The unix timestamp representing the last time a friend logged on.
     */
    public long getFriendLastLogon(SteamID steamId) {
        return cache.getUser(steamId).lastLogon;
    }

    /**
     * Gets the game name of a friend playing a game.
     *
     * @param steamId The steam id.
     * @return The game name of a friend playing a game, or null if they haven't
     * been cached yet.
     */
    public String getFriendGamePlayedName(SteamID steamId) {
        return cache.getUser(steamId).gameName;
    }

    /**
     * Gets the GameID of a friend playing a game.
     *
     * @param steamId The steam id.
     * @return The gameid of a friend playing a game, or 0 if they haven't been
     * cached yet.
     */
    public GameID getFriendGamePlayed(SteamID steamId) {
        return cache.getUser(steamId).gameId;
    }

    /**
     * Gets a SHA-1 hash representing the friend's avatar.
     *
     * @param steamId The SteamID of the friend to get the avatar of.
     * @return A byte array representing a SHA-1 hash of the friend's avatar.
     */
    public byte[] getFriendAvatar(SteamID steamId) {
        return cache.getUser(steamId).avatarHash;
    }

    /**
     * Gets the count of clans the local user is a member of.
     *
     * @return The number of clans this user is a member of.
     */
    public int getClanCount() {
        synchronized (listLock) {
            return clanList.size();
        }
    }

    /**
     * Gets a clan SteamID by index.
     *
     * @param index The index.
     * @return A valid steamid of a clan if the index is in range; otherwise a
     * steamid representing 0.
     */
    public SteamID getClanByIndex(int index) {
        synchronized (listLock) {
            if (index < 0 || index >= clanList.size()) {
                return new SteamID();
            }
            return clanList.get(index);
        }
    }

    /**
     * Gets the name of a clan.
     *
     * @param steamId The clan SteamID.
     * @return The name.
     */
    public String getClanName(SteamID steamId) {
        return cache.getClans().getAccount(steamId).name;
    }

    /**
     * Gets the relationship of a clan.
     *
     * @param steamId The clan steamid.
     * @return The relationship of the clan to the local user.
     */
    public EClanRelationship getClanRelationship(SteamID steamId) {
        return cache.getClans().getAccount(steamId).relationship;
    }

    /**
     * Gets a SHA-1 hash representing the clan's avatar.
     *
     * @param steamId The SteamID of the clan to get the avatar of.
     * @return A byte array representing a SHA-1 hash of the clan's avatar, or
     * null if the clan could not be found.
     */
    public byte[] getClanAvatar(SteamID steamId) {
        return cache.getClans().getAccount(steamId).avatarHash;
    }

    /**
     * Sends a chat message to a friend.
     *
     * @param target  The target to send to.
     * @param type    The type of message to send.
     * @param message The message to send.
     */
    public void sendChatMessage(SteamID target, EChatEntryType type, String message) {
        final ClientMsgProtobuf<CMsgClientFriendMsg.Builder> chatMsg = new ClientMsgProtobuf<CMsgClientFriendMsg.Builder>(CMsgClientFriendMsg.class, EMsg.ClientFriendMsg);
        chatMsg.getBody().setSteamid(target.convertToLong());
        chatMsg.getBody().setChatEntryType(type.v());
        chatMsg.getBody().setMessage(ByteString.copyFrom(message.getBytes()));
        getClient().send(chatMsg);
    }

    /**
     * Sends a friend request to a user.
     *
     * @param accountNameOrEmail The account name or email of the user.
     */
    public void addFriend(String accountNameOrEmail) {
        final ClientMsgProtobuf<CMsgClientAddFriend.Builder> addFriend = new ClientMsgProtobuf<CMsgClientAddFriend.Builder>(CMsgClientAddFriend.class, EMsg.ClientAddFriend);
        addFriend.getBody().setAccountnameOrEmailToAdd(accountNameOrEmail);
        getClient().send(addFriend);
    }

    /**
     * Sends a friend request to a user.
     *
     * @param steamId The SteamID of the friend to add.
     */
    public void addFriend(SteamID steamId) {
        final ClientMsgProtobuf<CMsgClientAddFriend.Builder> addFriend = new ClientMsgProtobuf<CMsgClientAddFriend.Builder>(CMsgClientAddFriend.class, EMsg.ClientAddFriend);
        addFriend.getBody().setSteamidToAdd(steamId.convertToLong());
        getClient().send(addFriend);
    }

    /**
     * Removes a friend from your friends list.
     *
     * @param steamId The SteamID of the friend to remove.
     */
    public void removeFriend(SteamID steamId) {
        final ClientMsgProtobuf<CMsgClientRemoveFriend.Builder> removeFriend = new ClientMsgProtobuf<CMsgClientRemoveFriend.Builder>(CMsgClientRemoveFriend.class, EMsg.ClientRemoveFriend);
        removeFriend.getBody().setFriendid(steamId.convertToLong());
        getClient().send(removeFriend);
    }

    // the default details to request in most situations
    final int defaultInfoRequest = EClientPersonaStateFlag.PlayerName.v() | EClientPersonaStateFlag.Presence.v() | EClientPersonaStateFlag.SourceID.v() | EClientPersonaStateFlag.GameExtraInfo.v() | EClientPersonaStateFlag.LastSeen.v();

    /**
     * Requests persona state for a list of specified SteamID. Results are
     * returned in {@link PersonaStateCallback}.
     *
     * @param steamIdList   A list of SteamIDs to request the info of.
     * @param requestedInfo The requested info flags.
     */
    public void requestFriendInfo(Collection<SteamID> steamIdList, int requestedInfo) {
        final ClientMsgProtobuf<CMsgClientRequestFriendData.Builder> request = new ClientMsgProtobuf<CMsgClientRequestFriendData.Builder>(CMsgClientRequestFriendData.class, EMsg.ClientRequestFriendData);

        for (final SteamID steamId : steamIdList) {
            request.getBody().getFriendsList().add(steamId.convertToLong());
        }
        request.getBody().setPersonaStateRequested(requestedInfo);

        getClient().send(request);
    }

    public void requestFriendInfo(Collection<SteamID> steamIdList, EClientPersonaStateFlag requestedInfo) {
        requestFriendInfo(steamIdList, requestedInfo.v());
    }

    public void requestFriendInfo(Collection<SteamID> steamIdList) {
        requestFriendInfo(steamIdList, defaultInfoRequest);
    }

    /**
     * Requests persona state for a specified SteamID. Results are returned in
     * {@link PersonaStateCallback}.
     *
     * @param steamId       A SteamID to request the info of.
     * @param requestedInfo The requested info flags.
     */
    public void requestFriendInfo(SteamID steamId, int requestedInfo) {
        final List<SteamID> temp = new ArrayList<SteamID>();
        temp.add(steamId);
        requestFriendInfo(temp, requestedInfo);
    }

    public void requestFriendInfo(SteamID steamId, EClientPersonaStateFlag requestedInfo) {
        requestFriendInfo(steamId, requestedInfo.v());
    }

    public void requestFriendInfo(SteamID steamId) {
        requestFriendInfo(steamId, defaultInfoRequest);
    }

    /**
     * Ignores or unignores a friend on Steam. Results are returned in a
     * {@link IgnoreFriendCallback}.
     *
     * @param steamId   The SteamID of the friend to ignore or unignore.
     * @param setIgnore if set to true, the friend will be ignored; otherwise, they
     *                  will be unignored.
     * @return The Job ID of the request. This can be used to find the
     * appropriate {@link JobCallback}.
     */
    public JobID ignoreFriend(SteamID steamId, boolean setIgnore) {
        final ClientMsg<MsgClientSetIgnoreFriend> ignore = new ClientMsg<MsgClientSetIgnoreFriend>(MsgClientSetIgnoreFriend.class);
        ignore.setSourceJobID(getClient().getNextJobID());
        ignore.getBody().setMySteamId(getClient().getSteamId());
        ignore.getBody().ignore = (byte) (setIgnore ? 1 : 0);
        ignore.getBody().setSteamIdFriend(steamId);
        getClient().send(ignore);
        return ignore.getSourceJobID();
    }

    public JobID ignoreFriend(SteamID steamId) {
        return ignoreFriend(steamId, true);
    }

    /**
     * Requests profile info for the given SteamID.
     * Results are returned in a {@link ProfileInfoCallback}
     *
     * @param steamId The SteamID to request the profile info of.
     * @return the JobID of the request
     */
    public JobID requestProfileInfo(SteamID steamId) {
        final ClientMsgProtobuf<CMsgClientFriendProfileInfo.Builder> request = new ClientMsgProtobuf<CMsgClientFriendProfileInfo.Builder>(CMsgClientFriendProfileInfo.class, EMsg.ClientFriendProfileInfo);
        request.setSourceJobID(getClient().getNextJobID());
        request.getBody().setSteamidFriend(steamId.convertToLong());
        getClient().send(request);
        return request.getSourceJobID();
    }

    /**
     * Requests message history for a specific friend
     *
     * @param steamId the SteamID of the friend to get history for
     */
    public void requestFriendMessageHistory(SteamID steamId) {
        final ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistory.Builder> request = new ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistory.Builder>(CMsgClientFSGetFriendMessageHistory.class, EMsg.ClientFSGetFriendMessageHistory);
        request.getBody().setSteamid(steamId.convertToLong());
        getClient().send(request);
    }

    /**
     * Requests message history for offline messages
     */
    public void requestOfflineMessageHistory() {
        final ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistoryForOfflineMessages.Builder> request = new ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistoryForOfflineMessages.Builder>(CMsgClientFSGetFriendMessageHistoryForOfflineMessages.class, EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages);
        getClient().send(request);
    }

    /**
     * Handles a client message. This should not be called directly.
     */
    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        switch (packetMsg.getMsgType()) {
            case ClientPersonaState:
                handlePersonaState(packetMsg);
                break;

            case ClientFriendsList:
                handleFriendsList(packetMsg);
                break;

            case ClientPlayerNicknameList:
                handlePlayerNicknameList(packetMsg);
                break;

            case ClientFriendMsgIncoming:
                handleFriendMsg(packetMsg);
                break;

            case ClientFriendMsgEchoToSender:
                handleFriendMsgEcho(packetMsg);
                break;

            case ClientAccountInfo:
                handleAccountInfo(packetMsg);
                break;

            case ClientAddFriendResponse:
                handleFriendResponse(packetMsg);
                break;

            case ClientSetIgnoreFriendResponse:
                handleIgnoreFriendResponse(packetMsg);
                break;

            case ClientFriendProfileInfoResponse:
                handleProfileInfoResponse(packetMsg);
                break;

            case ClientFSGetFriendsSteamLevelsResponse:
                handleSteamLevelResponse(packetMsg);
                break;

            case ClientFSGetFriendMessageHistoryResponse:
                handleFriendMessageHistoryResponse(packetMsg);
                break;
        }
    }

    private void handleAccountInfo(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientAccountInfo.Builder> accInfo = new ClientMsgProtobuf<CMsgClientAccountInfo.Builder>(CMsgClientAccountInfo.class, packetMsg);

        // cache off our local name
        cache.getLocalUser().name = accInfo.getBody().getPersonaName();
    }

    private void handleFriendMsg(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder> friendMsg = new ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder>(CMsgClientFriendMsgIncoming.class, packetMsg);
        final FriendMsgCallback callback = new FriendMsgCallback(friendMsg.getBody().build());
        getClient().postCallback(callback);
    }

    private void handleFriendMsgEcho(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder> friendMsgEcho = new ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder>(CMsgClientFriendMsgIncoming.class, packetMsg);
        final FriendMsgEchoCallback callback = new FriendMsgEchoCallback(friendMsgEcho.getBody().build());
        getClient().postCallback(callback);
    }

    private void handlePlayerNicknameList(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientPlayerNicknameList.Builder> list = new ClientMsgProtobuf<CMsgClientPlayerNicknameList.Builder>(CMsgClientPlayerNicknameList.class, packetMsg);
        for (CMsgClientPlayerNicknameList.PlayerNickname friend : list.getBody().getNicknamesList()) {
            cache.getUser(new SteamID(friend.getSteamid())).nickname = friend.getNickname();
        }
        final FriendsNicknameListCallback callback = new FriendsNicknameListCallback(list.getBody().build());
        getClient().postCallback(callback);
    }

    private void handleFriendsList(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFriendsList.Builder> list = new ClientMsgProtobuf<CMsgClientFriendsList.Builder>(CMsgClientFriendsList.class, packetMsg);

        cache.getLocalUser().steamId = getClient().getSteamId();

        if (!list.getBody().getBincremental()) {
            // if we're not an incremental update, the message contains all friends, so we should clear our current list
            synchronized (listLock) {
                friendList.clear();
                clanList.clear();
            }
        }

        // we have to request information for all of our friends because steam only sends persona information for online friends
        final ClientMsgProtobuf<CMsgClientRequestFriendData.Builder> reqInfo = new ClientMsgProtobuf<CMsgClientRequestFriendData.Builder>(CMsgClientRequestFriendData.class, EMsg.ClientRequestFriendData);

        reqInfo.getBody().setPersonaStateRequested(defaultInfoRequest);

        synchronized (listLock) {
            final List<SteamID> friendsToRemove = new ArrayList<SteamID>();
            final List<SteamID> clansToRemove = new ArrayList<SteamID>();

            for (final CMsgClientFriendsList.Friend friendObj : list.getBody().getFriendsList()) {
                final SteamID friendId = new SteamID(friendObj.getUlfriendid());

                if (friendId.isIndividualAccount()) {
                    final User user = cache.getUser(friendId);

                    user.relationship = EFriendRelationship.f(friendObj.getEfriendrelationship());

                    if (friendList.contains(friendId)) {
                        // if this is a friend on our list, and they removed us, mark them for removal
                        if (user.relationship == EFriendRelationship.None) {
                            friendsToRemove.add(friendId);
                        }
                    } else {
                        // we don't know about this friend yet, lets add them
                        friendList.add(friendId);
                    }
                } else if (friendId.isClanAccount()) {
                    final Clan clan = cache.getClans().getAccount(friendId);

                    clan.relationship = EClanRelationship.f(friendObj.getEfriendrelationship());

                    if (clanList.contains(friendId)) {
                        // mark clans we were removed/kicked from
                        // note: not actually sure about the kicked relationship, but i'm using it for good measure
                        if (clan.relationship == EClanRelationship.None || clan.relationship == EClanRelationship.Kicked) {
                            clansToRemove.add(friendId);
                        }
                    } else {
                        // don't know about this clan, add it
                        clanList.add(friendId);
                    }
                }

                if (!list.getBody().getBincremental()) {
                    // request persona state for our friend & clan list when it's a non-incremental update
                    reqInfo.getBody().addFriends(friendId.convertToLong());
                }
            }

            // remove anything we marked for removal
            friendList.removeAll(friendsToRemove);
            clanList.removeAll(clansToRemove);
        }

        if (reqInfo.getBody().getFriendsCount() > 0) {
            getClient().send(reqInfo);
        }

        final FriendsListCallback callback = new FriendsListCallback(list.getBody().build());
        getClient().postCallback(callback);
    }

    private void handlePersonaState(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientPersonaState.Builder> perState = new ClientMsgProtobuf<CMsgClientPersonaState.Builder>(CMsgClientPersonaState.class, packetMsg);
        final int flags = perState.getBody().getStatusFlags();
        for (final CMsgClientPersonaState.Friend friend : perState.getBody().getFriendsList()) {
            final SteamID friendId = new SteamID(friend.getFriendid());
            //SteamID sourceId = new SteamID(friend.getSteamidSource());
            if (friendId.isIndividualAccount()) {
                final User cacheFriend = cache.getUser(friendId);
                if ((flags & EClientPersonaStateFlag.PlayerName.v()) == EClientPersonaStateFlag.PlayerName.v()) {
                    cacheFriend.name = friend.getPlayerName();
                }
                //if ((flags & EClientPersonaStateFlag.Presence.v()) == EClientPersonaStateFlag.Presence.v()) {
                if (friend.getAvatarHash() != null) cacheFriend.avatarHash = friend.getAvatarHash().toByteArray();
                cacheFriend.personaState = EPersonaState.f(friend.getPersonaState());
                //}
                if ((flags & EClientPersonaStateFlag.LastSeen.v()) == EClientPersonaStateFlag.LastSeen.v()) {
                    cacheFriend.lastLogoff = friend.getLastLogoff();
                    cacheFriend.lastLogon = friend.getLastLogon();
                }
                if ((flags & EClientPersonaStateFlag.GameExtraInfo.v()) == EClientPersonaStateFlag.GameExtraInfo.v()) {
                    cacheFriend.gameName = friend.getGameName();
                    cacheFriend.gameId = new GameID(friend.getGameid());
                    cacheFriend.gameAppId = friend.getGamePlayedAppId();
                }
            } else if (friendId.isClanAccount()) {
                final Clan cacheClan = cache.getClans().getAccount(friendId);
                if ((flags & EClientPersonaStateFlag.PlayerName.v()) == EClientPersonaStateFlag.PlayerName.v()) {
                    cacheClan.name = friend.getPlayerName();
                }
            }
            // TODO: cache other details/account types?
        }
        for (final CMsgClientPersonaState.Friend friend : perState.getBody().getFriendsList()) {
            final PersonaStateCallback callback = new PersonaStateCallback(friend);
            getClient().postCallback(callback);
        }
    }

    private void handleFriendResponse(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientAddFriendResponse.Builder> friendResponse = new ClientMsgProtobuf<CMsgClientAddFriendResponse.Builder>(CMsgClientAddFriendResponse.class, packetMsg);
        final FriendAddedCallback callback = new FriendAddedCallback(friendResponse.getBody().build());
        getClient().postCallback(callback);
    }

    private void handleIgnoreFriendResponse(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientSetIgnoreFriendResponse> response = new ClientMsg<MsgClientSetIgnoreFriendResponse>(packetMsg, MsgClientSetIgnoreFriendResponse.class);
        final IgnoreFriendCallback innerCallback = new IgnoreFriendCallback(response.getBody());
        final JobCallback<?> callback = new JobCallback<IgnoreFriendCallback>(response.getTargetJobID(), innerCallback);
        getClient().postCallback(callback);
    }

    private void handleProfileInfoResponse(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFriendProfileInfoResponse.Builder> response = new ClientMsgProtobuf<CMsgClientFriendProfileInfoResponse.Builder>(CMsgClientFriendProfileInfoResponse.class, packetMsg);
        final ProfileInfoCallback callback = new ProfileInfoCallback(response.getBody().build());
        getClient().postCallback(callback);
    }

    private void handleSteamLevelResponse(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFSGetFriendsSteamLevelsResponse.Builder> response = new ClientMsgProtobuf<CMsgClientFSGetFriendsSteamLevelsResponse.Builder>(CMsgClientFSGetFriendsSteamLevelsResponse.class, packetMsg);
        final SteamLevelCallback callback = new SteamLevelCallback(response.getBody().build());
        getClient().postCallback(callback);
    }

    private void handleFriendMessageHistoryResponse(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistoryResponse.Builder> response = new ClientMsgProtobuf<CMsgClientFSGetFriendMessageHistoryResponse.Builder>(CMsgClientFSGetFriendMessageHistoryResponse.class, packetMsg);
        final FriendMsgHistoryCallback callback = new FriendMsgHistoryCallback(response.getBody().build());
        getClient().postCallback(callback);
    }

    public List<SteamID> getFriendList() {
        return this.friendList;
    }

    public List<SteamID> getClanList() {
        return this.clanList;
    }
}
