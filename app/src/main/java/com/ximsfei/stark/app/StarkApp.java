package com.ximsfei.stark.app;

import android.app.Application;
import android.content.Context;

import com.ximsfei.stark.core.Stark;

public class StarkApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Stark.get().load(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
