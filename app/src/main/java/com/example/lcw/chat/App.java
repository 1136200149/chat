package com.example.lcw.chat;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by admin on 2016/5/25.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);

    }
}
