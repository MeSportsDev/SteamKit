package com.vitaxa.steamkit.steam.steamclient.callbackmgr;

import com.vitaxa.steamkit.TestBase;
import org.junit.Before;
import org.junit.Test;
import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackManager;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import java.util.function.Consumer;

import static org.junit.Assert.*;

public class CallbackManagerTest extends TestBase {

    private SteamClient client;
    private CallbackManager mgr;

    @Before
    public void setUp() {
        client = new SteamClient();
        mgr = new CallbackManager(client);
    }

    @Test
    public void postedCallbackTriggersAction() {
        CallbackForTest callback = new CallbackForTest(UUID.randomUUID());

        final boolean[] didCall = {false};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(didCall[0]);
    }

    @Test
    public void postedCallbackTriggersAction_CatchAll() {
        final CallbackForTest callback = new CallbackForTest(UUID.randomUUID());

        final boolean[] didCall = {false};

        Consumer<CallbackMsg> action = new Consumer<CallbackMsg>() {
            @Override
            public void accept(CallbackMsg cb) {
                assertTrue(cb instanceof CallbackForTest);
                CallbackForTest cft = (CallbackForTest) cb;
                assertEquals(callback.getUuid(), cft.getUuid());
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(didCall[0]);
    }

    @Test
    public void postedCallbackTriggersActionForExplicitJobIDInvalid() {
        final JobID jobID = new JobID(123456);
        final CallbackForTest callback = new CallbackForTest(UUID.randomUUID());
        callback.setJobID(jobID);

        final boolean[] didCall = {false};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                assertEquals(jobID, cb.getJobID());
                assertEquals(callback.getUuid(), cb.getUuid());
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, JobID.INVALID, action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(didCall[0]);
    }

    @Test
    public void postedCallbackWithJobIDTriggersActionWhenNoJobIDSpecified() {
        final JobID jobID = new JobID(123456);
        final CallbackForTest callback = new CallbackForTest(UUID.randomUUID());
        callback.setJobID(jobID);

        final boolean[] didCall = {false};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                assertEquals(jobID, cb.getJobID());
                assertEquals(callback.getUuid(), cb.getUuid());
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(didCall[0]);
    }

    @Test
    public void postedCallbackDoesNotTriggerActionForWrongJobID() {
        JobID jobID = new JobID(123456);
        CallbackForTest callback = new CallbackForTest(UUID.randomUUID());
        callback.setJobID(jobID);

        final boolean[] didCall = {false};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, new JobID(123), action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertFalse(didCall[0]);
    }

    @Test
    public void postedCallbackWithJobIDTriggersCallbackForJobID() {
        final JobID jobID = new JobID(123456);
        final CallbackForTest callback = new CallbackForTest(UUID.randomUUID());
        callback.setJobID(jobID);

        final boolean[] didCall = {false};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                assertEquals(jobID, cb.getJobID());
                assertEquals(callback.getUuid(), cb.getUuid());
                didCall[0] = true;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, new JobID(123456), action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(didCall[0]);
    }

    @Test
    public void subscribedFunctionDoesNotRunWhenSubscriptionIsDisposed() {
        CallbackForTest callback = new CallbackForTest();

        final int[] callCount = {0};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                callCount[0]++;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, action)) {
            postAndRunCallback(callback);
        } catch (IOException e) {
            e.printStackTrace();
        }
        postAndRunCallback(callback);

        assertEquals(1, callCount[0]);
    }

    @Test
    public void postedCallbacksTriggerActions() {
        final CallbackForTest callback = new CallbackForTest(UUID.randomUUID());

        final int[] numCallbacksRun = {0};

        Consumer<CallbackForTest> action = new Consumer<CallbackForTest>() {
            @Override
            public void accept(CallbackForTest cb) {
                assertEquals(callback.getUuid(), cb.getUuid());
                numCallbacksRun[0]++;
            }
        };

        try (Closeable ignored = mgr.subscribe(CallbackForTest.class, action)) {
            for (int i = 0; i < 10; i++) {
                client.postCallback(callback);
            }

            mgr.runWaitAllCallbacks(1);
            assertEquals(10, numCallbacksRun[0]);

            mgr.runWaitAllCallbacks(1);
            assertEquals(10, numCallbacksRun[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void postAndRunCallback(CallbackMsg callback) {
        client.postCallback(callback);
        mgr.runCallbacks();
    }
}
