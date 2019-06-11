package uk.co.thomasc.steamkit.base.generated.internal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientRequestedClientStats implements ISteamSerializableMessage {

    private int countStats = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientRequestedClientStats;
    }

    public int getCountStats() {
        return this.countStats;
    }

    public void setCountStats(int countStats) {
        this.countStats = countStats;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeInt(countStats);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        countStats = br.readInt();
    }
}
