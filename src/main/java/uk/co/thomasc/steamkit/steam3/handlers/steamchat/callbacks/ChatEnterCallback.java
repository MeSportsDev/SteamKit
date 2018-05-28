package uk.co.thomasc.steamkit.steam3.handlers.steamchat.callbacks;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomEnterResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomType;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgClientChatEnter;
import uk.co.thomasc.steamkit.steam3.handlers.steamchat.types.ChatMemberInfo;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is fired in response to attempting to join a chat.
 */
public final class ChatEnterCallback extends CallbackMsg {
    /**
     * Gets SteamID of the chat room.
     */
    private final SteamID chatID;
    /**
     * Gets the friend ID.
     */
    private final SteamID friendID;
    /**
     * Gets the type of the chat room.
     */
    private final EChatRoomType chatRoomType;
    /**
     * Gets the SteamID of the chat room owner.
     */
    private final SteamID ownerID;
    /**
     * Gets clan SteamID that owns this chat room.
     */
    private final SteamID clanID;
    /**
     * Gets the chat flags.
     */
    private final byte chatFlags;
    /**
     * Gets the chat enter response.
     */
    private final EChatRoomEnterResponse enterResponse;
    /**
     * Gets the number of users currently in this chat room.
     */
    private final int numChatMembers;
    /**
     * Gets the name of the chat room.
     */
    private String chatRoomName;
    /**
     * Gets a list of ChatMemberInfo instances for each of the members of this chat room.
     */
    private List<ChatMemberInfo> chatMembers;

    public ChatEnterCallback(MsgClientChatEnter msg, byte[] payload) {
        chatID = msg.getSteamIdChat();
        friendID = msg.getSteamIdFriend();
        chatRoomType = msg.getChatRoomType();
        ownerID = msg.getSteamIdOwner();
        clanID = msg.getSteamIdClan();
        chatFlags = msg.getChatFlags();
        enterResponse = msg.getEnterResponse();
        numChatMembers = msg.getNumMembers();

        ByteArrayInputStream bais = new ByteArrayInputStream(payload);
        // reading the payload
        try {
            BinaryReader br = new BinaryReader(bais);
            // steamclient always attempts to read the chat room name, regardless of the enter response
            chatRoomName = br.readNullTermString();

            if (enterResponse != EChatRoomEnterResponse.Success) {
                // the rest of the payload depends on a successful chat enter
                return;
            }

            List<ChatMemberInfo> memberList = new ArrayList<>();

            for (int i = 0; i < numChatMembers; i++) {
                ChatMemberInfo memberInfo = new ChatMemberInfo();
                memberInfo.readFromStream(br);

                memberList.add(memberInfo);
            }

            chatMembers = Collections.unmodifiableList(memberList);
        } catch (IOException ignored) {
        }
    }

    /**
     * Gets SteamID of the chat room.
     */
    public SteamID getChatID() {
        return this.chatID;
    }

    /**
     * Gets the friend ID.
     */
    public SteamID getFriendID() {
        return this.friendID;
    }

    /**
     * Gets the type of the chat room.
     */
    public EChatRoomType getChatRoomType() {
        return this.chatRoomType;
    }

    /**
     * Gets the SteamID of the chat room owner.
     */
    public SteamID getOwnerID() {
        return this.ownerID;
    }

    /**
     * Gets clan SteamID that owns this chat room.
     */
    public SteamID getClanID() {
        return this.clanID;
    }

    /**
     * Gets the chat flags.
     */
    public byte getChatFlags() {
        return this.chatFlags;
    }

    /**
     * Gets the chat enter response.
     */
    public EChatRoomEnterResponse getEnterResponse() {
        return this.enterResponse;
    }

    /**
     * Gets the number of users currently in this chat room.
     */
    public int getNumChatMembers() {
        return this.numChatMembers;
    }

    /**
     * Gets the name of the chat room.
     */
    public String getChatRoomName() {
        return this.chatRoomName;
    }

    /**
     * Gets a list of ChatMemberInfo instances for each of the members of this chat room.
     */
    public List<ChatMemberInfo> getChatMembers() {
        return this.chatMembers;
    }
}
