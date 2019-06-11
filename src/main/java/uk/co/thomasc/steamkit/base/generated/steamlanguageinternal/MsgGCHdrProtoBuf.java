package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;


import uk.co.thomasc.steamkit.base.generated.gc.csgo.SteamMsgBase;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGCHdrProtoBuf implements IGCSerializableHeader {

    private int msg = 0;

    private int headerLength = 0;

    private SteamMsgBase.CMsgProtoBufHeader.Builder proto = SteamMsgBase.CMsgProtoBufHeader.newBuilder();

    @Override
    public void setEMsg(int msg) {
        this.msg = msg;
    }

    public int getMsg() {
        return this.msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public int getHeaderLength() {
        return this.headerLength;
    }

    public void setHeaderLength(int headerLength) {
        this.headerLength = headerLength;
    }

    public SteamMsgBase.CMsgProtoBufHeader.Builder getProto() {
        return this.proto;
    }

    public void setProto(SteamMsgBase.CMsgProtoBufHeader.Builder proto) {
        this.proto = proto;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(msg);
        byte[] protoBuffer = proto.build().toByteArray();
        headerLength = protoBuffer.length;
        bw.write(headerLength);
        bw.write(protoBuffer);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        msg = br.readInt();
        headerLength = br.readInt();
        byte[] protoBuffer = br.readBytes(headerLength);
        proto = SteamMsgBase.CMsgProtoBufHeader.newBuilder().mergeFrom(protoBuffer);
    }
}
