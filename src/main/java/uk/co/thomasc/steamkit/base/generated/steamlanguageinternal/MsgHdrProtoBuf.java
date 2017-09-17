package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.SteammessagesBase.CMsgProtoBufHeader;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;
import uk.co.thomasc.steamkit.util.util.MsgUtil;

import java.io.IOException;

public class MsgHdrProtoBuf implements ISteamSerializableHeader {
    // Static size: 4
    public EMsg msg = EMsg.Invalid;
    // Static size: 4
    public int headerLength = 0;
    // Static size: 0
    public CMsgProtoBufHeader.Builder proto = CMsgProtoBufHeader.newBuilder();

    public MsgHdrProtoBuf() {

    }

    @Override
    public void serialize(BinaryWriter stream) throws IOException {
        final byte[] pArr = proto.build().toByteArray();
        headerLength = pArr.length;

        stream.write(MsgUtil.makeMsg(msg.v(), true));
        stream.write(headerLength);
        stream.write(pArr);
    }

    @Override
    public void deSerialize(BinaryReader stream) throws IOException {
        msg = MsgUtil.getMsg(stream.readInt());
        headerLength = stream.readInt();

        proto = CMsgProtoBufHeader.newBuilder();
        final byte[] header = stream.readBytes(headerLength);
        proto.mergeFrom(header);
    }

    public void setMsg(EMsg msg) {
        this.msg = msg;
    }
}