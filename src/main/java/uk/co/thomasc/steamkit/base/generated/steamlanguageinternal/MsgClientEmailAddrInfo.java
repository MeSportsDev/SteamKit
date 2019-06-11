package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientEmailAddrInfo implements ISteamSerializableMessage {

    private int passwordStrength = 0;

    private int flagsAccountSecurityPolicy = 0;

    private boolean validated = false;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientEmailAddrInfo;
    }

    public int getPasswordStrength() {
        return this.passwordStrength;
    }

    public void setPasswordStrength(int passwordStrength) {
        this.passwordStrength = passwordStrength;
    }

    public int getFlagsAccountSecurityPolicy() {
        return this.flagsAccountSecurityPolicy;
    }

    public void setFlagsAccountSecurityPolicy(int flagsAccountSecurityPolicy) {
        this.flagsAccountSecurityPolicy = flagsAccountSecurityPolicy;
    }

    public boolean getValidated() {
        return this.validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeInt(passwordStrength);
        bw.writeInt(flagsAccountSecurityPolicy);
        bw.writeBoolean(validated);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        passwordStrength = br.readInt();
        flagsAccountSecurityPolicy = br.readInt();
        validated = br.readBoolean();
    }
}
