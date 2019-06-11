package com.vitaxa.steamkit.util;

import com.vitaxa.steamkit.TestBase;
import org.junit.Test;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;

public class NetHelpersTest extends TestBase {

    @Test
    public void testIntToAddress() throws UnknownHostException {
        int ipAddress = -1560361686;
        InetAddress address = NetHelpers.getIPAddress(ipAddress);
        assertEquals(InetAddress.getByName("162.254.197.42"), address);
    }

    @Test
    public void testAddressToInt() throws UnknownHostException {
        int address = NetHelpers.getIPAddress(InetAddress.getByName("162.254.197.42"));
        assertEquals(-1560361686, address);
    }
}
