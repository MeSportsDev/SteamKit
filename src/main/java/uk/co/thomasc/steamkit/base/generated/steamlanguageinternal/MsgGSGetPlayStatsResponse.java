package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSGetPlayStatsResponse implements ISteamSerializableMessage {

    private EResult result = EResult.from(0);

    private int rank = 0;

    private int lifetimeConnects = 0;

    private int lifetimeMinutesPlayed = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.GSGetPlayStatsResponse;
    }

    public EResult getResult() {
        return this.result;
    }

    public void setResult(EResult result) {
        this.result = result;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getLifetimeConnects() {
        return this.lifetimeConnects;
    }

    public void setLifetimeConnects(int lifetimeConnects) {
        this.lifetimeConnects = lifetimeConnects;
    }

    public int getLifetimeMinutesPlayed() {
        return this.lifetimeMinutesPlayed;
    }

    public void setLifetimeMinutesPlayed(int lifetimeMinutesPlayed) {
        this.lifetimeMinutesPlayed = lifetimeMinutesPlayed;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(result.code());
        bw.write(rank);
        bw.write(lifetimeConnects);
        bw.write(lifetimeMinutesPlayed);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        result = EResult.from(br.readInt());
        rank = br.readInt();
        lifetimeConnects = br.readInt();
        lifetimeMinutesPlayed = br.readInt();
    }
}
