package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import java.io.Closeable;
import java.io.IOException;

public class Subscription implements Closeable {

    private ICallbackMgrInternals manager;
    private CallbackBase call;

    public Subscription(ICallbackMgrInternals manager, CallbackBase call) {
        this.manager = manager;
        this.call = call;
    }

    @Override
    public void close() throws IOException {
        if (call != null && manager != null) {
            manager.unregister(call);
            call = null;
            manager = null;
        }
    }
}
