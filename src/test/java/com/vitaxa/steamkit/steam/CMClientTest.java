package com.vitaxa.steamkit.steam;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientServerList;
import com.amelic.steamprotobuf.generated.enums.EMsg;
import com.amelic.steamprotobuf.generated.enums.EServerType;
import com.vitaxa.steamkit.TestBase;
import org.junit.Test;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.ISteamSerializableHeader;
import uk.co.thomasc.steamkit.base.PacketClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.PacketMsg;
import uk.co.thomasc.steamkit.base.internal.MsgHdr;
import uk.co.thomasc.steamkit.base.internal.MsgHdrProtoBuf;
import uk.co.thomasc.steamkit.steam3.CMClient;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class CMClientTest extends TestBase {
    @Test
    public void getPacketMsgReturnsPacketMsgForCryptoHandshake() throws IOException {
        EMsg[] messages = new EMsg[]{
                EMsg.ChannelEncryptRequest,
                EMsg.ChannelEncryptResponse,
                EMsg.ChannelEncryptResult
        };

        for (EMsg message : messages) {
            MsgHdr msgHdr = new MsgHdr();
            msgHdr.setEMsg(message);

            byte[] data = serialize(msgHdr);

            IPacketMsg packetMsg = CMClient.getPacketMsg(data);
            assertTrue(packetMsg instanceof PacketMsg);
        }
    }

    @Test
    public void getPacketMsgReturnsPacketClientMsgProtobufForMessagesWithProtomask() throws IOException {
        MsgHdrProtoBuf msgHdr = new MsgHdrProtoBuf();
        msgHdr.setMsg(EMsg.ClientLogOnResponse);

        byte[] data = serialize(msgHdr);
        IPacketMsg packetMsg = CMClient.getPacketMsg(data);
        assertTrue(packetMsg instanceof PacketClientMsgProtobuf);
    }

    @Test
    public void getPacketMsgFailsWithNull() throws IOException {
        MsgHdrProtoBuf msgHdr = new MsgHdrProtoBuf();
        msgHdr.setMsg(EMsg.ClientLogOnResponse);

        byte[] data = serialize(msgHdr);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryWriter bw = new BinaryWriter(baos);
        bw.writeInt(-1);
        System.arraycopy(baos.toByteArray(), 0, data, 4, 4);
        IPacketMsg packetMsg = CMClient.getPacketMsg(data);
        assertNull(packetMsg);
    }

    @Test
    public void getPacketMsgFailsWithTinyArray() {
        byte[] data = new byte[3];
        IPacketMsg packetMsg = CMClient.getPacketMsg(data);
        assertNull(packetMsg);
    }

    @Test
    public void serverLookupIsClearedWhenDisconnecting() {
        ClientMsgProtobuf<CMsgClientServerList.Builder> msg = new ClientMsgProtobuf<CMsgClientServerList.Builder>(CMsgClientServerList.class, EMsg.ClientServerList);
        CMsgClientServerList.Server server = CMsgClientServerList.Server.newBuilder()
                .setServerIp(0x7F000001)
                .setServerType(EServerType.CM.code())
                .setServerPort(1234)
                .build();
        msg.getBody().addServers(server);

        DummyClient client = new DummyClient();

        client.handleClientMsg(msg);
        assertEquals(1, client.getServers(EServerType.CM).size());

        client.dummyDisconnect();
        assertEquals(0, client.getServers(EServerType.CM).size());
    }

    @Test
    public void serverLookupDoesNotAccumulateDuplicates() {
        ClientMsgProtobuf<CMsgClientServerList.Builder> msg = new ClientMsgProtobuf<CMsgClientServerList.Builder>(CMsgClientServerList.class, EMsg.ClientServerList);
        CMsgClientServerList.Server server = CMsgClientServerList.Server.newBuilder()
                .setServerIp(0x7F000001)
                .setServerType(EServerType.CM.code())
                .setServerPort(1234)
                .build();
        msg.getBody().addServers(server);

        DummyClient client = new DummyClient();

        client.handleClientMsg(msg);
        assertEquals(1, client.getServers(EServerType.CM).size());

        client.handleClientMsg(msg);
        assertEquals(1, client.getServers(EServerType.CM).size());
    }

    private static byte[] serialize(ISteamSerializableHeader hdr) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        hdr.serialize(baos);
        return baos.toByteArray();
    }

}
