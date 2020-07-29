package uk.co.thomasc.steamkit.base.internal;

import com.amelic.steamprotobuf.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientJoinChat implements ISteamSerializableMessage {

    private long steamIdChat = 0L;

    private boolean isVoiceSpeaker = false;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientJoinChat;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToUInt64();
    }

    public boolean getIsVoiceSpeaker() {
        return this.isVoiceSpeaker;
    }

    public void setIsVoiceSpeaker(boolean isVoiceSpeaker) {
        this.isVoiceSpeaker = isVoiceSpeaker;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(steamIdChat);
        bw.writeBoolean(isVoiceSpeaker);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdChat = br.readLong();
        isVoiceSpeaker = br.readBoolean();
    }
}
