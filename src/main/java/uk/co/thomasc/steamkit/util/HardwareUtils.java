package uk.co.thomasc.steamkit.util;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EOSType;
import uk.co.thomasc.steamkit.util.util.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class HardwareUtils {
    // Everything taken from here
    // https://stackoverflow.com/questions/1986732/how-to-get-a-unique-computer-identifier-in-java-like-disk-id-or-motherboard-id
    private static String SERIAL_NUMBER;

    public static byte[] getMachineID() {
        // the aug 25th 2015 CM update made well-formed machine MessageObjects required for logon
        // this was flipped off shortly after the update rolled out, likely due to linux steamclients running on distros without a way to build a machineid
        // so while a valid MO isn't currently (as of aug 25th) required, they could be in the future and we'll abide by The Valve Law now

        if (SERIAL_NUMBER != null) {
            return SERIAL_NUMBER.getBytes();
        }

        final EOSType osType = Utils.getOSType();
        switch (osType) {
            case Windows10:
                SERIAL_NUMBER = getSerialNumberWin();
                break;
            case MacOSUnknown:
                SERIAL_NUMBER = getSerialNumberMac();
                break;
            case LinuxUnknown:
                SERIAL_NUMBER = getSerialNumberUnix();
                break;
            default:
                throw new AssertionError(String.format("Unknown OS type: %s", osType));
        }

        return SERIAL_NUMBER == null ? new byte[0] : SERIAL_NUMBER.getBytes();
    }

    private static String getSerialNumberWin() {
        String sn = null;

        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec(new String[]{"wmic", "bios", "get", "serialnumber"});
        } catch (IOException e) {
            return null;
        }

        OutputStream os = process.getOutputStream();

        try {
            os.close();
        } catch (IOException ignored) {
        }

        try (Scanner sc = new Scanner(process.getInputStream())) {
            while (sc.hasNext()) {
                String next = sc.next();
                if ("SerialNumber".equals(next)) {
                    sn = sc.next().trim();
                    break;
                }
            }
        }

        return sn;
    }

    private static String getSerialNumberMac() {
        String sn = null;

        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
        } catch (IOException e) {
            return null;
        }

        OutputStream os = process.getOutputStream();

        try {
            os.close();
        } catch (IOException ignored) {
        }

        String line;
        String marker = "Serial Number";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            while ((line = br.readLine()) != null) {
                if (line.contains(marker)) {
                    sn = line.split(":")[1].trim();
                    break;
                }
            }
        } catch (IOException e) {
            return null;
        }

        return sn;
    }

    private static String getSerialNumberUnix() {
        String sn = readDmidecode();

        if (sn == null) {
            sn = readLshal();
        }

        return sn;
    }

    private static BufferedReader read(String command) {

        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec(command.split(" "));
        } catch (IOException e) {
            return null;
        }

        OutputStream os = process.getOutputStream();

        try {
            os.close();
        } catch (IOException ignored) {
        }

        return new BufferedReader(new InputStreamReader(process.getInputStream()));
    }

    private static String readDmidecode() {

        String sn = null;

        String line;
        String marker = "Serial Number:";

        try (BufferedReader br = read("dmidecode -t system")) {
            if (br == null) {
                return null;
            }

            while ((line = br.readLine()) != null) {
                if (line.contains(marker)) {
                    sn = line.split(marker)[1].trim();
                    break;
                }
            }
        } catch (IOException e) {
            return null;
        }

        return sn;
    }

    private static String readLshal() {
        String sn = null;

        String line;
        String marker = "system.hardware.serial =";

        try (BufferedReader br = read("lshal")) {
            if (br == null) {
                return null;
            }
            while ((line = br.readLine()) != null) {
                if (line.contains(marker)) {
                    sn = line.split(marker)[1].replaceAll("\\(string\\)|(\\')", "").trim();
                    break;
                }
            }
        } catch (IOException e) {
            return null;
        }

        return sn;
    }
}
