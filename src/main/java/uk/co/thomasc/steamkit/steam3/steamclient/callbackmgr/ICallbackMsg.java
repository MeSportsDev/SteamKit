package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.types.JobID;

/**
 * A callback message
 */
public interface ICallbackMsg<C extends ICallbackMsg<C>> {
    JobID getJobID();

    C setJobID(JobID jobID);
}
