package com.famgy.famgyelfhook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.famgy.xhook.XHook;
import com.famgy.xhookapply.XHookApply;
import com.famgy.xhooktest.XHookTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load xhook
        XHook.getInstance().init(this.getApplicationContext());
        if(!XHook.getInstance().isInited()) {
            return;
        }

        //load and run your biz lib (for register hook points)
        XHookApply.getInstance().init();
        XHookApply.getInstance().start();

        //xhook do refresh
        XHook.getInstance().refresh(false);

        //load and run the target lib
        XHookTest.getInstance().init();
        XHookTest.getInstance().start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //xhook do refresh again
        XHook.getInstance().refresh(false);

        //xhook do refresh again for some reason,
        //maybe called after some System.loadLibrary() and System.load()
        //*
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                {
                    XHook.getInstance().refresh(true);

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
