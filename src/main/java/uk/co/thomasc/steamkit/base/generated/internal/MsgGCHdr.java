package uk.co.thomasc.steamkit.base.generated.internal;

import uk.co.thomasc.steamkit.base.IGCSerializableHeader;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGCHdr implements IGCSerializableHeader {

    private short headerVersion = (short) 1;

    private long targetJobID = 0xFFFFFFFFFFFFFFFFL;

    private long sourceJobID = 0xFFFFFFFFFFFFFFFFL;

    @Override
    public void setEMsg(int msg) {
    }

    public short getHeaderVersion() {
        return this.headerVersion;
    }

    public void setHeaderVersion(short headerVersion) {
        this.headerVersion = headerVersion;
    }

    public long getTargetJobID() {
        return this.targetJobID;
    }

    public void setTargetJobID(long targetJobID) {
        this.targetJobID = targetJobID;
    }

    public long getSourceJobID() {
        return this.sourceJobID;
    }

    public void setSourceJobID(long sourceJobID) {
        this.sourceJobID = sourceJobID;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeShort(headerVersion);
        bw.writeLong(targetJobID);
        bw.writeLong(sourceJobID);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        headerVersion = br.readShort();
        targetJobID = br.readLong();
        sourceJobID = br.readLong();
    }
}
