package uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.callbacks;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver.CMsgClientTicketAuthComplete;
import com.amelic.steamprotobuf.generated.enums.EAuthSessionResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.GameID;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired when ticket authentication has completed.
 */
public final class TicketAuthCallback extends CallbackMsg {
    /**
     * Gets the SteamID the ticket auth completed for.
     */
    private final SteamID steamId;
    /**
     * Gets the GameID the ticket was for.
     */
    private final GameID gameId;
    /**
     * Gets the authentication state.
     */
    private final int state;
    /**
     * Gets the auth session response.
     */
    private final EAuthSessionResponse authSessionResponse;
    /**
     * Gets the ticket CRC.
     */
    private final int ticketCRC;
    /**
     * Gets the ticket sequence.
     */
    private final int ticketSequence;

    public TicketAuthCallback(CMsgClientTicketAuthComplete.Builder tickAuth) {
        steamId = new SteamID(tickAuth.getSteamId());
        gameId = new GameID(tickAuth.getGameId());
        state = tickAuth.getEstate();
        authSessionResponse = EAuthSessionResponse.from(tickAuth.getEauthSessionResponse());
        ticketCRC = tickAuth.getTicketCrc();
        ticketSequence = tickAuth.getTicketSequence();
    }

    /**
     * Gets the SteamID the ticket auth completed for.
     */
    public SteamID getSteamId() {
        return this.steamId;
    }

    /**
     * Gets the GameID the ticket was for.
     */
    public GameID getGameId() {
        return this.gameId;
    }

    /**
     * Gets the authentication state.
     */
    public int getState() {
        return this.state;
    }

    /**
     * Gets the auth session response.
     */
    public EAuthSessionResponse getAuthSessionResponse() {
        return this.authSessionResponse;
    }

    /**
     * Gets the ticket CRC.
     */
    public int getTicketCRC() {
        return this.ticketCRC;
    }

    /**
     * Gets the ticket sequence.
     */
    public int getTicketSequence() {
        return this.ticketSequence;
    }
}
