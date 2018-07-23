package com.famgy.xhooktest;

/**
 * Created by caikelun on 18/01/2018.
 */

public class XHookTest {
    private static final XHookTest ourInstance = new XHookTest();

    public static XHookTest getInstance() {
        return ourInstance;
    }

    private XHookTest() {
    }

    public synchronized void init() {
        System.loadLibrary("xhooktest");
    }

    public synchronized void start() {
        NativeHandler.getInstance().start();
    }
}
