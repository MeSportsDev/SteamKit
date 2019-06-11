package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EDenyReason;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSDeny implements ISteamSerializableMessage {

    private long steamId = 0L;

    private EDenyReason denyReason = EDenyReason.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.GSDeny;
    }

    public SteamID getSteamId() {
        return new SteamID(this.steamId);
    }

    public void setSteamId(SteamID steamId) {
        this.steamId = steamId.convertToLong();
    }

    public EDenyReason getDenyReason() {
        return this.denyReason;
    }

    public void setDenyReason(EDenyReason denyReason) {
        this.denyReason = denyReason;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(steamId);
        bw.write(denyReason.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamId = br.readLong();
        denyReason = EDenyReason.from(br.readInt());
    }
}
