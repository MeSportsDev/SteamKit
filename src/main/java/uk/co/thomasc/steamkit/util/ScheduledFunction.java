package uk.co.thomasc.steamkit.util;

import uk.co.thomasc.steamkit.util.cSharp.events.Action;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFunction implements Runnable {
    public long delay;

    private Action func;

    private boolean bStarted;
    private ScheduledExecutorService timer;
    private ScheduledFuture<?> task;

    public ScheduledFunction(Action func) {
        this(func, 1);
    }

    public ScheduledFunction(Action func, long delay) {
        this.func = func;
        this.delay = delay;

        timer = Executors.newSingleThreadScheduledExecutor();
    }

    public void start() {
        if (bStarted) {
            return;
        }

        task = timer.scheduleAtFixedRate(this, 0, delay, TimeUnit.MILLISECONDS);
        bStarted = true;
    }

    public void stop() {
        if (!bStarted) {
            return;
        }

        bStarted = !task.cancel(false);
    }

    @Override
    public void run() {
        if (func != null) {
            func.call();
        }
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
}
