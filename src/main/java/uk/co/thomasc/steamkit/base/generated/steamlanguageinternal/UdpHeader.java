package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EUdpPacketType;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UdpHeader implements ISteamSerializable {

    public static final int MAGIC = 0x31305356;

    private int magic = UdpHeader.MAGIC;

    private short payloadSize = (short) 0;

    private EUdpPacketType packetType = EUdpPacketType.Invalid;

    private byte flags = (byte) 0;

    private int sourceConnID = 512;

    private int destConnID = 0;

    private int seqThis = 0;

    private int seqAck = 0;

    private int packetsInMsg = 0;

    private int msgStartSeq = 0;

    private int msgSize = 0;

    public int getMagic() {
        return this.magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public short getPayloadSize() {
        return this.payloadSize;
    }

    public void setPayloadSize(short payloadSize) {
        this.payloadSize = payloadSize;
    }

    public EUdpPacketType getPacketType() {
        return this.packetType;
    }

    public void setPacketType(EUdpPacketType packetType) {
        this.packetType = packetType;
    }

    public byte getFlags() {
        return this.flags;
    }

    public void setFlags(byte flags) {
        this.flags = flags;
    }

    public int getSourceConnID() {
        return this.sourceConnID;
    }

    public void setSourceConnID(int sourceConnID) {
        this.sourceConnID = sourceConnID;
    }

    public int getDestConnID() {
        return this.destConnID;
    }

    public void setDestConnID(int destConnID) {
        this.destConnID = destConnID;
    }

    public int getSeqThis() {
        return this.seqThis;
    }

    public void setSeqThis(int seqThis) {
        this.seqThis = seqThis;
    }

    public int getSeqAck() {
        return this.seqAck;
    }

    public void setSeqAck(int seqAck) {
        this.seqAck = seqAck;
    }

    public int getPacketsInMsg() {
        return this.packetsInMsg;
    }

    public void setPacketsInMsg(int packetsInMsg) {
        this.packetsInMsg = packetsInMsg;
    }

    public int getMsgStartSeq() {
        return this.msgStartSeq;
    }

    public void setMsgStartSeq(int msgStartSeq) {
        this.msgStartSeq = msgStartSeq;
    }

    public int getMsgSize() {
        return this.msgSize;
    }

    public void setMsgSize(int msgSize) {
        this.msgSize = msgSize;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(magic);
        bw.write(payloadSize);
        bw.write(packetType.code());
        bw.write(flags);
        bw.write(sourceConnID);
        bw.write(destConnID);
        bw.write(seqThis);
        bw.write(seqAck);
        bw.write(packetsInMsg);
        bw.write(msgStartSeq);
        bw.write(msgSize);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        magic = br.readInt();
        payloadSize = br.readShort();
        packetType = EUdpPacketType.from(br.readByte());
        flags = br.readByte();
        sourceConnID = br.readInt();
        destConnID = br.readInt();
        seqThis = br.readInt();
        seqAck = br.readInt();
        packetsInMsg = br.readInt();
        msgStartSeq = br.readInt();
        msgSize = br.readInt();
    }
}
