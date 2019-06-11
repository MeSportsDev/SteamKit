package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.gc.csgo.SteamMsgBase.CMsgProtoBufHeader;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;
import uk.co.thomasc.steamkit.util.util.MsgUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgHdrProtoBuf implements ISteamSerializableHeader {

    private EMsg msg = EMsg.Invalid;

    private int headerLength = 0;

    private CMsgProtoBufHeader.Builder proto = CMsgProtoBufHeader.newBuilder();

    @Override
    public void setEMsg(EMsg msg) {
        this.msg = msg;
    }

    public EMsg getMsg() {
        return this.msg;
    }

    public void setMsg(EMsg msg) {
        this.msg = msg;
    }

    public int getHeaderLength() {
        return this.headerLength;
    }

    public void setHeaderLength(int headerLength) {
        this.headerLength = headerLength;
    }

    public CMsgProtoBufHeader.Builder getProto() {
        return this.proto;
    }

    public void setProto(CMsgProtoBufHeader.Builder proto) {
        this.proto = proto;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(MsgUtil.makeMsg(msg.code(), true));
        byte[] protoBuffer = proto.build().toByteArray();
        headerLength = protoBuffer.length;
        bw.write(headerLength);
        bw.write(protoBuffer);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        msg = MsgUtil.getMsg(br.readInt());
        headerLength = br.readInt();
        byte[] protoBuffer = br.readBytes(headerLength);
        proto = CMsgProtoBufHeader.newBuilder().mergeFrom(protoBuffer);
    }
}
