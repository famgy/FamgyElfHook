package com.famgy.xhookapply;

/**
 * Created by caikelun on 18/01/2018.
 */

public class XHookApply {
    private static final XHookApply ourInstance = new XHookApply();

    public static XHookApply getInstance() {
        return ourInstance;
    }

    private XHookApply() {
    }

    public synchronized void init() {
        System.loadLibrary("xhookapply");
    }

    public synchronized void start() {
        NativeHandler.getInstance().start();
    }
}
