package uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientLBSFindOrCreateLBResponse;
import com.amelic.steamprotobuf.generated.enums.ELeaderboardDisplayType;
import com.amelic.steamprotobuf.generated.enums.ELeaderboardSortMethod;
import com.amelic.steamprotobuf.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.SteamUserStats;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is fired in response to {@link SteamUserStats#findLeaderBoard(int, String)} and
 * {@link SteamUserStats#createLeaderboard(int, String, ELeaderboardSortMethod, ELeaderboardDisplayType)}.
 */
public class FindOrCreateLeaderboardCallback extends CallbackMsg {

    private EResult result;

    private int id;

    private int entryCount;

    private ELeaderboardSortMethod sortMethod;

    private ELeaderboardDisplayType displayType;

    public FindOrCreateLeaderboardCallback(JobID jobID, CMsgClientLBSFindOrCreateLBResponse.Builder resp) {
        result = EResult.from(resp.getEresult());
        id = resp.getLeaderboardId();
        entryCount = resp.getLeaderboardEntryCount();
        sortMethod = ELeaderboardSortMethod.from(resp.getLeaderboardSortMethod());
        displayType = ELeaderboardDisplayType.from(resp.getLeaderboardDisplayType());
    }

    public EResult getResult() {
        return result;
    }

    public int getId() {
        return id;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public ELeaderboardSortMethod getSortMethod() {
        return sortMethod;
    }

    public ELeaderboardDisplayType getDisplayType() {
        return displayType;
    }
}
