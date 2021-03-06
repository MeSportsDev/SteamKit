package uk.co.thomasc.steamkit.steam3.handlers.steamfriends;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientChatGetFriendMessageHistory;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientChatGetFriendMessageHistoryForOfflineMessages;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientChatGetFriendMessageHistoryResponse;
import com.amelic.steamprotobuf.generated.enums.EAccountType;
import com.amelic.steamprotobuf.generated.enums.EChatAction;
import com.amelic.steamprotobuf.generated.enums.EChatEntryType;
import com.amelic.steamprotobuf.generated.enums.EChatInfoType;
import com.amelic.steamprotobuf.generated.enums.EChatMemberStateChange;
import com.amelic.steamprotobuf.generated.enums.EClientPersonaStateFlag;
import com.amelic.steamprotobuf.generated.enums.EMsg;
import com.amelic.steamprotobuf.generated.enums.EPersonaState;
import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatAction;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatActionResult;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatEnter;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatMemberInfo;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatMsg;
import uk.co.thomasc.steamkit.base.internal.MsgClientChatRoomInfo;
import uk.co.thomasc.steamkit.base.internal.MsgClientInviteGroup;
import uk.co.thomasc.steamkit.base.internal.MsgClientJoinChat;
import uk.co.thomasc.steamkit.base.internal.MsgClientRespondGroupInvite;
import uk.co.thomasc.steamkit.base.internal.MsgClientSetIgnoreFriend;
import uk.co.thomasc.steamkit.base.internal.MsgClientSetIgnoreFriendResponse;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.AliasHistoryCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatActionResultCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatEnterCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatInviteCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatMemberInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatMsgCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ChatRoomInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ClanStateCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.FriendAddedCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.FriendMsgCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.FriendMsgEchoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.FriendMsgHistoryCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.FriendsListCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.IgnoreFriendCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.NicknameCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.NicknameListCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.PersonaChangeCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.PersonaStatesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback.ProfileInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.PersonaState;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientAMGetPersonaNameHistory;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientAMGetPersonaNameHistoryResponse;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientChatInvite;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientClanState;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientAddFriend;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientAddFriendResponse;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientChangeStatus;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendMsg;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendMsgIncoming;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendProfileInfo;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendProfileInfoResponse;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientFriendsList;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientPersonaState;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientPlayerNicknameList;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientRemoveFriend;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientRequestFriendData;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientSetPlayerNickname;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgClientSetPlayerNicknameResponse;
import static com.amelic.steamprotobuf.generated.SteammessagesClientserverFriends.CMsgPersonaChangeResponse;

/**
 * This handler handles all interaction with other users on the Steam3 network.
 */
@SuppressWarnings("unused")
public class SteamFriends extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamFriends() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientPersonaState, this::handlePersonaState);
        dispatchMap.put(EMsg.ClientClanState, this::handleClanState);
        dispatchMap.put(EMsg.ClientFriendsList, this::handleFriendsList);
        dispatchMap.put(EMsg.ClientFriendMsgIncoming, this::handleFriendMsg);
        dispatchMap.put(EMsg.ClientFriendMsgEchoToSender, this::handleFriendEchoMsg);
        dispatchMap.put(EMsg.ClientFSGetFriendMessageHistoryResponse, this::handleFriendMessageHistoryResponse);
        dispatchMap.put(EMsg.ClientChatGetFriendMessageHistoryResponse, this::handleFriendMessageHistoryResponse);
        dispatchMap.put(EMsg.ClientAddFriendResponse, this::handleFriendResponse);
        dispatchMap.put(EMsg.ClientChatEnter, this::handleChatEnter);
        dispatchMap.put(EMsg.ClientChatMsg, this::handleChatMsg);
        dispatchMap.put(EMsg.ClientChatMemberInfo, this::handleChatMemberInfo);
        dispatchMap.put(EMsg.ClientChatRoomInfo, this::handleChatRoomInfo);
        dispatchMap.put(EMsg.ClientChatActionResult, this::handleChatActionResult);
        dispatchMap.put(EMsg.ClientChatInvite, this::handleChatInvite);
        dispatchMap.put(EMsg.ClientSetIgnoreFriendResponse, this::handleIgnoreFriendResponse);
        dispatchMap.put(EMsg.ClientFriendProfileInfoResponse, this::handleProfileInfoResponse);
        dispatchMap.put(EMsg.ClientPersonaChangeResponse, this::handlePersonaChangeResponse);
        dispatchMap.put(EMsg.ClientPlayerNicknameList, this::handleNicknameList);
        dispatchMap.put(EMsg.AMClientSetPlayerNicknameResponse, this::handlePlayerNicknameResponse);
        dispatchMap.put(EMsg.ClientAMGetPersonaNameHistoryResponse, this::handleAliasHistoryResponse);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Sets the local user's persona name and broadcasts it over the network.
     * Results are returned in a{@link PersonaChangeCallback} callback.
     *
     * @param name The name.
     */
    public void setPersonaName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }

        ClientMsgProtobuf<CMsgClientChangeStatus.Builder> stateMsg
                = new ClientMsgProtobuf<>(CMsgClientChangeStatus.class, EMsg.ClientChangeStatus);

        stateMsg.getBody().setPlayerName(name);

        client.send(stateMsg);
    }

    /**
     * Sets the local user's persona state and broadcasts it over the network.
     * Results are returned in a{@link PersonaChangeCallback} callback.
     *
     * @param state The state.
     */
    public void setPersonaState(EPersonaState state) {
        if (state == null) {
            throw new IllegalArgumentException("state is null");
        }

        ClientMsgProtobuf<CMsgClientChangeStatus.Builder> stateMsg
                = new ClientMsgProtobuf<>(CMsgClientChangeStatus.class, EMsg.ClientChangeStatus);

        stateMsg.getBody().setPersonaState(state.code());

        client.send(stateMsg);
    }

    /**
     * Sends a chat message to a friend.
     *
     * @param target  The target to send to.
     * @param type    The type of message to send.
     * @param message The message to send.
     */
    public void sendChatMessage(SteamID target, EChatEntryType type, String message) {
        if (target == null) {
            throw new IllegalArgumentException("target is null");
        }

        if (type == null) {
            throw new IllegalArgumentException("type is null");
        }

        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }

        ClientMsgProtobuf<CMsgClientFriendMsg.Builder> chatMsg = new ClientMsgProtobuf<>(CMsgClientFriendMsg.class, EMsg.ClientFriendMsg);

        chatMsg.getBody().setSteamid(target.convertToUInt64());
        chatMsg.getBody().setChatEntryType(type.code());
        chatMsg.getBody().setMessage(ByteString.copyFrom(message, StandardCharsets.UTF_8));

        client.send(chatMsg);
    }

    /**
     * Sends a friend request to a user.
     *
     * @param accountNameOrEmail The account name or email of the user.
     */
    public void addFriend(String accountNameOrEmail) {
        if (accountNameOrEmail == null) {
            throw new IllegalArgumentException("accountNameOrEmail is null");
        }

        ClientMsgProtobuf<CMsgClientAddFriend.Builder> addFriend = new ClientMsgProtobuf<>(CMsgClientAddFriend.class, EMsg.ClientAddFriend);

        addFriend.getBody().setAccountnameOrEmailToAdd(accountNameOrEmail);

        client.send(addFriend);
    }

    /**
     * Sends a friend request to a user.
     *
     * @param steamID The SteamID of the friend to add.
     */
    public void addFriend(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        ClientMsgProtobuf<CMsgClientAddFriend.Builder> addFriend = new ClientMsgProtobuf<>(CMsgClientAddFriend.class, EMsg.ClientAddFriend);

        addFriend.getBody().setSteamidToAdd(steamID.convertToUInt64());

        client.send(addFriend);
    }

    /**
     * Removes a friend from your friends list.
     *
     * @param steamID The SteamID of the friend to remove.
     */
    public void removeFriend(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        ClientMsgProtobuf<CMsgClientRemoveFriend.Builder> removeFriend = new ClientMsgProtobuf<>(CMsgClientRemoveFriend.class, EMsg.ClientRemoveFriend);

        removeFriend.getBody().setFriendid(steamID.convertToUInt64());

        client.send(removeFriend);
    }

    /**
     * Attempts to join a chat room.
     *
     * @param steamID The SteamID of the chat room.
     */
    public void joinChat(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        SteamID chatID = fixChatID(steamID); // copy the steamid so we don't modify it

        ClientMsg<MsgClientJoinChat> joinChat = new ClientMsg<>(MsgClientJoinChat.class);

        joinChat.getBody().setSteamIdChat(chatID);

        client.send(joinChat);
    }

    /**
     * Attempts to leave a chat room.
     *
     * @param steamID The SteamID of the chat room.
     */
    public void leaveChat(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        SteamID chatID = fixChatID(steamID); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatMemberInfo> leaveChat = new ClientMsg<>(MsgClientChatMemberInfo.class);

        leaveChat.getBody().setSteamIdChat(chatID);
        leaveChat.getBody().setType(EChatInfoType.StateChange);

        try {
            leaveChat.write(client.getSteamID().convertToUInt64()); // ChatterActedOn
            leaveChat.write(EChatMemberStateChange.Left.code()); // StateChange
            leaveChat.write(client.getSteamID().convertToUInt64()); // ChatterActedBy
        } catch (IOException e) {
            DebugLog.printStackTrace("SteamFriends", e);
        }

        client.send(leaveChat);
    }

    /**
     * Sends a message to a chat room.
     *
     * @param steamIdChat The SteamID of the chat room.
     * @param type        The message type.
     * @param message     The message.
     */
    public void sendChatRoomMessage(SteamID steamIdChat, EChatEntryType type, String message) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (type == null) {
            throw new IllegalArgumentException("type is null");
        }

        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatMsg> chatMsg = new ClientMsg<>(MsgClientChatMsg.class);

        chatMsg.getBody().setChatMsgType(type);
        chatMsg.getBody().setSteamIdChatRoom(chatID);
        chatMsg.getBody().setSteamIdChatter(client.getSteamID());

        try {
            chatMsg.writeNullTermString(message, Charset.forName("UTF-8"));
        } catch (IOException e) {
            DebugLog.printStackTrace("SteamFriends", e);
        }

        client.send(chatMsg);
    }

    /**
     * Invites a user to a chat room.
     * The results of this action will be available through the {@link ChatActionResultCallback} callback.
     *
     * @param steamIdUser The SteamID of the user to invite.
     * @param steamIdChat The SteamID of the chat room to invite the user to.
     */
    public void inviteUserToChat(SteamID steamIdUser, SteamID steamIdChat) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdUser == null) {
            throw new IllegalArgumentException("steamIdUser is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsgProtobuf<CMsgClientChatInvite.Builder> inviteMsg = new ClientMsgProtobuf<>(CMsgClientChatInvite.class, EMsg.ClientChatInvite);

        inviteMsg.getBody().setSteamIdChat(chatID.convertToUInt64());
        inviteMsg.getBody().setSteamIdInvited(steamIdUser.convertToUInt64());

        // steamclient also sends the steamid of the user that did the invitation
        // we'll mimic that behavior
        inviteMsg.getBody().setSteamIdPatron(client.getSteamID().convertToUInt64());

        client.send(inviteMsg);
    }

    /**
     * Kicks the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to kick the member from.
     * @param steamIdMember The SteamID of the member to kick from the chat.
     */
    public void kickChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.Kick);

        client.send(kickMember);
    }

    /**
     * Bans the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to ban the member from.
     * @param steamIdMember The SteamID of the member to ban from the chat.
     */
    public void banChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.Ban);

        client.send(kickMember);
    }

    /**
     * Unbans the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to unban the member from.
     * @param steamIdMember The SteamID of the member to unban from the chat.
     */
    public void unbanChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.UnBan);

        client.send(kickMember);
    }

    /**
     * Requests persona state for a list of specified SteamID.
     * Results are returned in {@link PersonaState}.
     *
     * @param steamIdList   A list of SteamIDs to request the info of.
     * @param requestedInfo The requested info flags. If none specified, this uses {@link SteamConfiguration#getDefaultPersonaStateFlags()}.
     */
    public void requestFriendInfo(List<SteamID> steamIdList, int requestedInfo) {
        if (steamIdList == null) {
            throw new IllegalArgumentException("steamIdList is null");
        }

        if (requestedInfo == 0) {
            requestedInfo = EClientPersonaStateFlag.code(client.getConfiguration().getDefaultPersonaStateFlags());
        }

        ClientMsgProtobuf<CMsgClientRequestFriendData.Builder> request = new ClientMsgProtobuf<>(CMsgClientRequestFriendData.class, EMsg.ClientRequestFriendData);

        for (SteamID steamID : steamIdList) {
            request.getBody().addFriends(steamID.convertToUInt64());
        }
        request.getBody().setPersonaStateRequested(requestedInfo);

        client.send(request);
    }

    /**
     * Requests persona state for a specified SteamID.
     * Results are returned in {@link PersonaState}.
     *
     * @param steamID       A SteamID to request the info of.
     * @param requestedInfo The requested info flags. If none specified, this uses {@link SteamConfiguration#getDefaultPersonaStateFlags()}.
     */
    public void requestFriendInfo(SteamID steamID, int requestedInfo) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        List<SteamID> list = new ArrayList<>();
        list.add(steamID);
        requestFriendInfo(list, requestedInfo);
    }

    /**
     * Ignores a friend on Steam.
     * Results are returned in a {@link IgnoreFriendCallback}.
     *
     * @param steamID The SteamID of the friend to ignore or unignore.
     * @return The Job ID of the request. This can be used to find the appropriate {@link IgnoreFriendCallback}.
     */
    public AsyncJob<IgnoreFriendCallback> ignoreFriend(SteamID steamID) {
        return ignoreFriend(steamID, true);
    }

    /**
     * Ignores or unignores a friend on Steam.
     * Results are returned in a {@link IgnoreFriendCallback}.
     *
     * @param steamID   The SteamID of the friend to ignore or unignore.
     * @param setIgnore if set to <b>true</b>, the friend will be ignored; otherwise, they will be unignored.
     * @return The Job ID of the request. This can be used to find the appropriate {@link IgnoreFriendCallback}.
     */
    public AsyncJob<IgnoreFriendCallback> ignoreFriend(SteamID steamID, boolean setIgnore) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        ClientMsg<MsgClientSetIgnoreFriend> ignore = new ClientMsg<>(MsgClientSetIgnoreFriend.class);
        JobID jobID = client.getNextJobID();
        ignore.setSourceJobID(jobID);

        ignore.getBody().setMySteamId(client.getSteamID());
        ignore.getBody().setIgnore(setIgnore ? (byte) 1 : (byte) 0);
        ignore.getBody().setSteamIdFriend(steamID);

        client.send(ignore);

        return new SimpleAsyncJob<IgnoreFriendCallback>(client, ignore.getSourceJobID());
    }

    /**
     * Requests profile information for the given {@link SteamID}
     * Results are returned in a {@link ProfileInfoCallback}
     *
     * @param steamID The SteamID of the friend to request the details of.
     * @return The Job ID of the request. This can be used to find the appropriate {@link ProfileInfoCallback}.
     */
    public AsyncJob<ProfileInfoCallback> requestProfileInfo(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        ClientMsgProtobuf<CMsgClientFriendProfileInfo.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientFriendProfileInfo.class, EMsg.ClientFriendProfileInfo);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setSteamidFriend(steamID.convertToUInt64());

        client.send(request);

        return new SimpleAsyncJob<ProfileInfoCallback>(client, request.getSourceJobID());
    }

    /**
     * Requests the last few chat messages with a friend.
     * Results are returned in a {@link FriendMsgHistoryCallback}
     *
     * @param steamID SteamID of the friend
     */
    public void requestMessageHistory(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        ClientMsgProtobuf<CMsgClientChatGetFriendMessageHistory.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientChatGetFriendMessageHistory.class, EMsg.ClientChatGetFriendMessageHistory);

        request.getBody().setSteamid(steamID.convertToUInt64());

        client.send(request);
    }

    /**
     * Requests all offline messages.
     * This also marks them as read server side.
     * Results are returned in a {@link FriendMsgHistoryCallback}.
     */
    public void requestOfflineMessages() {
        ClientMsgProtobuf<CMsgClientChatGetFriendMessageHistoryForOfflineMessages.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientChatGetFriendMessageHistoryForOfflineMessages.class, EMsg.ClientChatGetFriendMessageHistoryForOfflineMessages);
        client.send(request);
    }

    /**
     * Set the nickname of a friend.
     * The result is returned in a {@link NicknameCallback}.
     *
     * @param friendID the steam id of the friend
     * @param nickname the nickname to set to
     * @return The Job ID of the request. This can be used to find the appropriate {@link NicknameCallback}.
     */
    public JobID setFriendNickname(SteamID friendID, String nickname) {
        if (friendID == null) {
            throw new IllegalArgumentException("friendID is null");
        }
        if (nickname == null) {
            throw new IllegalArgumentException("nickname is null");
        }

        ClientMsgProtobuf<CMsgClientSetPlayerNickname.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientSetPlayerNickname.class, EMsg.AMClientSetPlayerNickname);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setSteamid(friendID.convertToUInt64());
        request.getBody().setNickname(nickname);

        client.send(request);

        return jobID;
    }

    /**
     * Request the alias history of the account of the given steam id.
     * The result is returned in a {@link AliasHistoryCallback}.
     *
     * @param steamID the steam id
     * @return The Job ID of the request. This can be used to find the appropriate {@link AliasHistoryCallback}.
     */
    public JobID requestAliasHistory(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }
        return requestAliasHistory(Collections.singletonList(steamID));
    }

    /**
     * Request the alias history of the accounts of the given steam ids.
     * The result is returned in a {@link AliasHistoryCallback}.
     *
     * @param steamIDs the steam ids
     * @return The Job ID of the request. This can be used to find the appropriate {@link AliasHistoryCallback}.
     */
    public JobID requestAliasHistory(List<SteamID> steamIDs) {
        if (steamIDs == null) {
            throw new IllegalArgumentException("steamIDs is null");
        }

        ClientMsgProtobuf<CMsgClientAMGetPersonaNameHistory.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientAMGetPersonaNameHistory.class, EMsg.ClientAMGetPersonaNameHistory);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        for (SteamID steamID : steamIDs) {
            request.getBody().addIds(CMsgClientAMGetPersonaNameHistory.IdInstance.newBuilder()
                    .setSteamid(steamID.convertToUInt64()));
        }

        request.getBody().setIdCount(request.getBody().getIdsCount());

        client.send(request);

        return jobID;
    }

    /**
     * Invites a user to a Steam group. Only send group invites in response to a user's request; sending automated group
     * invites is a violation of the Steam Subscriber Agreement and can get you banned.
     *
     * @param userSteamID  - The SteamID of the user you're inviting as a SteamID object, or a string that can parse into one
     * @param groupSteamID - The SteamID of the group you're inviting the user to as a SteamID object, or a string that can parse into one
     */
    public void inviteToGroup(SteamID userSteamID, SteamID groupSteamID) {
        ClientMsg<MsgClientInviteGroup> inviteGroup = new ClientMsg<>(MsgClientInviteGroup.class);
        inviteGroup.getBody().setSteamId(userSteamID.convertToUInt64());
        inviteGroup.getBody().setGroupId(groupSteamID.convertToUInt64());

        client.send(inviteGroup);
    }

    /**
     * Respond to an incoming group invite.
     *
     * @param groupSteamID - The group you were invited to, as a SteamID object or a string which can parse into one
     * @param accept       - true to join the group, false to ignore invitation
     */
    public void respondToGroupInvite(SteamID groupSteamID, boolean accept) {
        ClientMsg<MsgClientRespondGroupInvite> respondGroupInvite = new ClientMsg<>(MsgClientRespondGroupInvite.class);
        respondGroupInvite.getBody().setGroupId(groupSteamID.convertToUInt64());
        respondGroupInvite.getBody().setAccept(accept);

        client.send(respondGroupInvite);
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

    private SteamID fixChatID(SteamID steamIdChat) {
        SteamID chatID = new SteamID(steamIdChat.convertToUInt64()); // copy the steamid so we don't modify it

        if (chatID.isClanAccount()) {
            // this steamid is incorrect, so we'll fix it up
            chatID.setAccountInstance(SteamID.ChatInstanceFlags.CLAN.code());
            chatID.setAccountType(EAccountType.Chat);
        }

        return chatID;
    }

    private void handleFriendMsg(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder> friendMsg = new ClientMsgProtobuf<>(CMsgClientFriendMsgIncoming.class, packetMsg);
        client.postCallback(new FriendMsgCallback(friendMsg.getBody()));
    }

    private void handleFriendEchoMsg(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientFriendMsgIncoming.Builder> friendMsg = new ClientMsgProtobuf<>(CMsgClientFriendMsgIncoming.class, packetMsg);
        client.postCallback(new FriendMsgEchoCallback(friendMsg.getBody()));
    }

    private void handleFriendMessageHistoryResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientChatGetFriendMessageHistoryResponse.Builder> historyResponse =
                new ClientMsgProtobuf<>(CMsgClientChatGetFriendMessageHistoryResponse.class, packetMsg);
        client.postCallback(new FriendMsgHistoryCallback(historyResponse.getBody(), client.getUniverse()));
    }

    private void handleFriendsList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientFriendsList.Builder> list = new ClientMsgProtobuf<>(CMsgClientFriendsList.class, packetMsg);

        // we have to request information for all of our friends because steam only sends persona information for online friends
        ClientMsgProtobuf<CMsgClientRequestFriendData.Builder> reqInfo = new ClientMsgProtobuf<>(CMsgClientRequestFriendData.class, EMsg.ClientRequestFriendData);

        reqInfo.getBody().setPersonaStateRequested(EClientPersonaStateFlag.code(client.getConfiguration().getDefaultPersonaStateFlags()));

        for (CMsgClientFriendsList.Friend friendObj : list.getBody().getFriendsList()) {
            if (!list.getBody().getBincremental()) {
                // request persona state for our friend & clan list when it's a non-incremental update
                reqInfo.getBody().addFriends(friendObj.getUlfriendid());
            }
        }

        if (reqInfo.getBody().getFriendsCount() > 0) {
            client.send(reqInfo);
        }

        client.postCallback(new FriendsListCallback(list.getBody()));
    }

    private void handlePersonaState(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientPersonaState.Builder> persState = new ClientMsgProtobuf<>(CMsgClientPersonaState.class, packetMsg);

        client.postCallback(new PersonaStatesCallback(persState.getBody()));
    }

    private void handleClanState(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientClanState.Builder> clanState = new ClientMsgProtobuf<>(CMsgClientClanState.class, packetMsg);
        client.postCallback(new ClanStateCallback(clanState.getBody()));
    }

    private void handleFriendResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientAddFriendResponse.Builder> friendResponse = new ClientMsgProtobuf<>(CMsgClientAddFriendResponse.class, packetMsg);
        client.postCallback(new FriendAddedCallback(friendResponse.getBody()));
    }

    private void handleChatEnter(IPacketMsg packetMsg) {
        ClientMsg<MsgClientChatEnter> chatEnter = new ClientMsg<>(MsgClientChatEnter.class, packetMsg);
        byte[] payload = chatEnter.getPayload().toByteArray();
        client.postCallback(new ChatEnterCallback(chatEnter.getBody(), payload));
    }

    private void handleChatMsg(IPacketMsg packetMsg) {
        ClientMsg<MsgClientChatMsg> chatMsg = new ClientMsg<>(MsgClientChatMsg.class, packetMsg);
        byte[] payload = chatMsg.getPayload().toByteArray();
        client.postCallback(new ChatMsgCallback(chatMsg.getBody(), payload));
    }

    private void handleChatMemberInfo(IPacketMsg packetMsg) {
        ClientMsg<MsgClientChatMemberInfo> membInfo = new ClientMsg<>(MsgClientChatMemberInfo.class, packetMsg);
        byte[] payload = membInfo.getPayload().toByteArray();
        client.postCallback(new ChatMemberInfoCallback(membInfo.getBody(), payload));
    }

    private void handleChatRoomInfo(IPacketMsg packetMsg) {
        ClientMsg<MsgClientChatRoomInfo> roomInfo = new ClientMsg<>(MsgClientChatRoomInfo.class, packetMsg);
        byte[] payload = roomInfo.getPayload().toByteArray();
        client.postCallback(new ChatRoomInfoCallback(roomInfo.getBody(), payload));
    }

    private void handleChatActionResult(IPacketMsg packetMsg) {
        ClientMsg<MsgClientChatActionResult> actionResult = new ClientMsg<>(MsgClientChatActionResult.class, packetMsg);
        client.postCallback(new ChatActionResultCallback(actionResult.getBody()));
    }

    private void handleChatInvite(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientChatInvite.Builder> chatInvite = new ClientMsgProtobuf<>(CMsgClientChatInvite.class, packetMsg);
        client.postCallback(new ChatInviteCallback(chatInvite.getBody()));
    }

    private void handleIgnoreFriendResponse(IPacketMsg packetMsg) {
        ClientMsg<MsgClientSetIgnoreFriendResponse> response = new ClientMsg<>(MsgClientSetIgnoreFriendResponse.class, packetMsg);
        client.postCallback(new IgnoreFriendCallback(response.getTargetJobID(), response.getBody()));
    }

    private void handleProfileInfoResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientFriendProfileInfoResponse.Builder> response = new ClientMsgProtobuf<>(CMsgClientFriendProfileInfoResponse.class, packetMsg);
        client.postCallback(new ProfileInfoCallback(new JobID(packetMsg.getTargetJobID()), response.getBody()));
    }

    private void handlePersonaChangeResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgPersonaChangeResponse.Builder> response = new ClientMsgProtobuf<>(CMsgPersonaChangeResponse.class, packetMsg);

        client.postCallback(new PersonaChangeCallback(new JobID(packetMsg.getTargetJobID()), response.getBody()));
    }

    private void handleNicknameList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientPlayerNicknameList.Builder> resp =
                new ClientMsgProtobuf<>(CMsgClientPlayerNicknameList.class, packetMsg);

        client.postCallback(new NicknameListCallback(resp.getBody()));
    }

    private void handlePlayerNicknameResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientSetPlayerNicknameResponse.Builder> resp =
                new ClientMsgProtobuf<>(CMsgClientSetPlayerNicknameResponse.class, packetMsg);

        client.postCallback(new NicknameCallback(resp.getTargetJobID(), resp.getBody()));
    }

    private void handleAliasHistoryResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientAMGetPersonaNameHistoryResponse.Builder> resp =
                new ClientMsgProtobuf<>(CMsgClientAMGetPersonaNameHistoryResponse.class, packetMsg);

        client.postCallback(new AliasHistoryCallback(resp.getTargetJobID(), resp.getBody()));
    }
}
