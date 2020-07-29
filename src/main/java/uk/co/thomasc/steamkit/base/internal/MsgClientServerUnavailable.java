package uk.co.thomasc.steamkit.base.internal;

import com.amelic.steamprotobuf.generated.enums.EMsg;
import com.amelic.steamprotobuf.generated.enums.EServerType;
import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientServerUnavailable implements ISteamSerializableMessage {

    private long jobidSent = 0L;

    private int eMsgSent = 0;

    private EServerType eServerTypeUnavailable = EServerType.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientServerUnavailable;
    }

    public long getJobidSent() {
        return this.jobidSent;
    }

    public void setJobidSent(long jobidSent) {
        this.jobidSent = jobidSent;
    }

    public int getEMsgSent() {
        return this.eMsgSent;
    }

    public void setEMsgSent(int eMsgSent) {
        this.eMsgSent = eMsgSent;
    }

    public EServerType getEServerTypeUnavailable() {
        return this.eServerTypeUnavailable;
    }

    public void setEServerTypeUnavailable(EServerType eServerTypeUnavailable) {
        this.eServerTypeUnavailable = eServerTypeUnavailable;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(jobidSent);
        bw.writeInt(eMsgSent);
        bw.writeInt(eServerTypeUnavailable.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        jobidSent = br.readLong();
        eMsgSent = br.readInt();
        eServerTypeUnavailable = EServerType.from(br.readInt());
    }
}
