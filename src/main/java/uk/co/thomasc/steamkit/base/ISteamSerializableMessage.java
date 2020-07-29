package uk.co.thomasc.steamkit.base;

import com.amelic.steamprotobuf.generated.enums.EMsg;

public interface ISteamSerializableMessage extends ISteamSerializable {
    EMsg getEMsg();
}
