package uk.co.thomasc.steamkit.steam3.handlers.steamworkshop;

import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgCREEnumeratePublishedFiles;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgCREEnumeratePublishedFilesResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumeratePublishedFilesByUserAction;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumeratePublishedFilesByUserActionResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumerateUserPublishedFiles;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumerateUserPublishedFilesResponse;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumerateUserSubscribedFiles;
import com.amelic.steamprotobuf.generated.SteammessagesClientserver2.CMsgClientUCMEnumerateUserSubscribedFilesResponse;
import com.amelic.steamprotobuf.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.callbacks.PublishedFilesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.callbacks.UserActionPublishedFilesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.callbacks.UserPublishedFilesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.callbacks.UserSubscribedFilesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.types.EnumerationDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.types.EnumerationUserDetails;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for requesting files published on the Steam Workshop.
 */
public class SteamWorkshop extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamWorkshop() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.CREEnumeratePublishedFilesResponse, this::handleEnumPublishedFiles);
        dispatchMap.put(EMsg.ClientUCMEnumerateUserPublishedFilesResponse, this::handleEnumUserPublishedFiles);
        dispatchMap.put(EMsg.ClientUCMEnumerateUserSubscribedFilesResponse, this::handleEnumUserSubscribedFiles);
        dispatchMap.put(EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse, this::handleEnumPublishedFilesByAction);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Enumerates the list of published files for the current logged in user.
     * Results are returned in a {@link UserPublishedFilesCallback}.
     *
     * @param details The specific details of the request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link UserPublishedFilesCallback}.
     */
    public AsyncJob<UserPublishedFilesCallback> enumerateUserPublishedFiles(EnumerationUserDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgClientUCMEnumerateUserPublishedFiles.Builder> enumRequest =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumerateUserPublishedFiles.class, EMsg.ClientUCMEnumerateUserPublishedFiles);
        JobID jobID = client.getNextJobID();
        enumRequest.setSourceJobID(jobID);

        enumRequest.getBody().setAppId(details.getAppID());
        enumRequest.getBody().setSortOrder(details.getSortOrder());
        enumRequest.getBody().setStartIndex(details.getStartIndex());

        client.send(enumRequest);

        return new SimpleAsyncJob<UserPublishedFilesCallback>(client, enumRequest.getSourceJobID());
    }

    /**
     * Enumerates the list of subscribed files for the current logged in user.
     * Results are returned in a {@link UserSubscribedFilesCallback}.
     *
     * @param details The specific details of the request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link UserSubscribedFilesCallback}.
     */
    public AsyncJob<UserSubscribedFilesCallback> enumerateUserSubscribedFiles(EnumerationUserDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgClientUCMEnumerateUserSubscribedFiles.Builder> enumRequest =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumerateUserSubscribedFiles.class, EMsg.ClientUCMEnumerateUserSubscribedFiles);
        JobID jobID = client.getNextJobID();
        enumRequest.setSourceJobID(jobID);

        enumRequest.getBody().setAppId(details.getAppID());
        enumRequest.getBody().setStartIndex(details.getStartIndex());

        client.send(enumRequest);

        return new SimpleAsyncJob<UserSubscribedFilesCallback>(client, enumRequest.getSourceJobID());
    }

    /**
     * Enumerates the list of published files for the current logged in user based on user action.
     * Results are returned in a {@link UserActionPublishedFilesCallback}.
     *
     * @param details The specific details of the request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link UserActionPublishedFilesCallback}.
     */
    public AsyncJob<UserActionPublishedFilesCallback> enumeratePublishedFilesByUserAction(EnumerationUserDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgClientUCMEnumeratePublishedFilesByUserAction.Builder> enumRequest =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumeratePublishedFilesByUserAction.class, EMsg.ClientUCMEnumeratePublishedFilesByUserAction);
        JobID jobID = client.getNextJobID();
        enumRequest.setSourceJobID(jobID);

        enumRequest.getBody().setAction(details.getUserAction().code());
        enumRequest.getBody().setAppId(details.getAppID());
        enumRequest.getBody().setStartIndex(details.getStartIndex());

        client.send(enumRequest);

        return new SimpleAsyncJob<UserActionPublishedFilesCallback>(client, enumRequest.getSourceJobID());
    }

    /**
     * Enumerates the list of all published files on the Steam workshop.
     * Results are returned in a {@link PublishedFilesCallback}.
     *
     * @param details The specific details of the request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link PublishedFilesCallback}.
     */
    public AsyncJob<PublishedFilesCallback> enumeratePublishedFiles(EnumerationDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgCREEnumeratePublishedFiles.Builder> enumRequest =
                new ClientMsgProtobuf<>(CMsgCREEnumeratePublishedFiles.class, EMsg.CREEnumeratePublishedFiles);
        JobID jobID = client.getNextJobID();
        enumRequest.setSourceJobID(jobID);

        enumRequest.getBody().setAppId(details.getAppID());
        enumRequest.getBody().setQueryType(details.getType().code());
        enumRequest.getBody().setStartIndex(details.getStartIndex());
        enumRequest.getBody().setDays(details.getDays());
        enumRequest.getBody().setCount(details.getCount());
        enumRequest.getBody().addAllTags(details.getTags());
        enumRequest.getBody().addAllUserTags(details.getUserTags());

        client.send(enumRequest);

        return new SimpleAsyncJob<PublishedFilesCallback>(client, enumRequest.getSourceJobID());
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg is null");
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            dispatcher.accept(packetMsg);
        }
    }

    private void handleEnumPublishedFiles(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgCREEnumeratePublishedFilesResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgCREEnumeratePublishedFilesResponse.class, packetMsg);

        client.postCallback(new PublishedFilesCallback(response.getTargetJobID(), response.getBody()));
    }

    private void handleEnumUserPublishedFiles(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUCMEnumerateUserPublishedFilesResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumerateUserPublishedFilesResponse.class, packetMsg);

        client.postCallback(new UserPublishedFilesCallback(response.getTargetJobID(), response.getBody()));
    }

    private void handleEnumUserSubscribedFiles(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUCMEnumerateUserSubscribedFilesResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumerateUserSubscribedFilesResponse.class, packetMsg);

        client.postCallback(new UserSubscribedFilesCallback(response.getTargetJobID(), response.getBody()));
    }

    private void handleEnumPublishedFilesByAction(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUCMEnumeratePublishedFilesByUserActionResponse.Builder> response =
                new ClientMsgProtobuf<>(CMsgClientUCMEnumeratePublishedFilesByUserActionResponse.class, packetMsg);

        client.postCallback(new UserActionPublishedFilesCallback(response.getTargetJobID(), response.getBody()));
    }
}
