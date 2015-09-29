package com.iluwatar.callback;

/**
 * Template-method class for callback hook execution
 */
public abstract class AbsTask {

    public final void executeWith(ICallback callback) {
        execute();
        if (callback != null) {
            callback.call();
        }
    }

    public abstract void execute();
}
