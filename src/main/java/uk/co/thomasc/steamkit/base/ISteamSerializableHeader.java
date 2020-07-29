package uk.co.thomasc.steamkit.base;

import com.amelic.steamprotobuf.generated.enums.EMsg;

public interface ISteamSerializableHeader extends ISteamSerializable {
    void setEMsg(EMsg msg);
}
