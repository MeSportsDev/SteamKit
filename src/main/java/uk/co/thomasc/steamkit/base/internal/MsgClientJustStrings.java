package uk.co.thomasc.steamkit.base.internal;

import com.amelic.steamprotobuf.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientJustStrings implements ISteamSerializableMessage {

    @Override
    public EMsg getEMsg() {
        return EMsg.Invalid;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

    }
}
