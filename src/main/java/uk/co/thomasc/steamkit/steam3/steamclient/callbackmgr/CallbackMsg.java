package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.types.JobID;

public class CallbackMsg implements ICallbackMsg<CallbackMsg> {

    private JobID jobID = JobID.INVALID;

    @Override
    public JobID getJobID() {
        return this.jobID;
    }

    @Override
    public CallbackMsg setJobID(JobID jobID) {
        this.jobID = jobID;
        return this;
    }
}
