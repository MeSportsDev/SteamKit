package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientClanState;
import com.amelic.steamprotobuf.generated.enums.EAccountFlags;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.Event;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * This callback is posted when a clan's state has been changed.
 */
public class ClanStateCallback extends CallbackMsg {

    private SteamID clanID;

    private EnumSet<EAccountFlags> accountFlags;

    private boolean chatRoomPrivate;

    private String clanName;

    private byte[] avatarHash;

    private int memberTotalCount;

    private int memberOnlineCount;

    private int memberChattingCount;

    private int memberInGameCount;

    private List<Event> events;

    private List<Event> announcements;

    public ClanStateCallback(CMsgClientClanState.Builder msg) {
        clanID = new SteamID(msg.getSteamidClan());

        accountFlags = EAccountFlags.from(msg.getClanAccountFlags());
        chatRoomPrivate = msg.getChatRoomPrivate();

        if (msg.hasNameInfo()) {
            clanName = msg.getNameInfo().getClanName();
            avatarHash = msg.getNameInfo().getShaAvatar().toByteArray();
        }

        if (msg.hasUserCounts()) {
            memberTotalCount = msg.getUserCounts().getMembers();
            memberOnlineCount = msg.getUserCounts().getOnline();
            memberChattingCount = msg.getUserCounts().getChatting();
            memberInGameCount = msg.getUserCounts().getInGame();
        }

        events = new ArrayList<>();
        for (CMsgClientClanState.Event event : msg.getEventsList()) {
            events.add(new Event(event));
        }
        this.events = Collections.unmodifiableList(events);

        announcements = new ArrayList<>();
        for (CMsgClientClanState.Event event : msg.getAnnouncementsList()) {
            announcements.add(new Event(event));
        }
        this.announcements = Collections.unmodifiableList(announcements);
    }

    public SteamID getClanID() {
        return clanID;
    }

    public EnumSet<EAccountFlags> getAccountFlags() {
        return accountFlags;
    }

    public boolean isChatRoomPrivate() {
        return chatRoomPrivate;
    }

    public String getClanName() {
        return clanName;
    }

    public byte[] getAvatarHash() {
        return avatarHash;
    }

    public int getMemberTotalCount() {
        return memberTotalCount;
    }

    public int getMemberOnlineCount() {
        return memberOnlineCount;
    }

    public int getMemberChattingCount() {
        return memberChattingCount;
    }

    public int getMemberInGameCount() {
        return memberInGameCount;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Event> getAnnouncements() {
        return announcements;
    }
}

