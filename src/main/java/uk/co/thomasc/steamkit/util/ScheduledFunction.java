package uk.co.thomasc.steamkit.util;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduledFunction {

    private long delay;

    private Runnable func;

    private Timer timer;

    private boolean bStarted = false;

    public ScheduledFunction(Runnable func, long delay) {
        this.delay = delay;
        this.func = func;
    }

    public void start() {
        if (!bStarted) {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    if (func != null) {
                        func.run();
                    }
                }
            }, 0, delay);
            bStarted = true;
        }
    }

    public void stop() {
        if (bStarted) {
            timer.cancel();
            timer = null;
            bStarted = false;
        }
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
}
