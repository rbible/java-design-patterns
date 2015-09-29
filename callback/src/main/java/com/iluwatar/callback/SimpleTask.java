package com.iluwatar.callback;

/**
 * Implementation of task that need to be executed
 */
public class SimpleTask extends AbsTask {

    @Override
    public void execute() {
        System.out.println("Perform some important activity.");
    }

}
