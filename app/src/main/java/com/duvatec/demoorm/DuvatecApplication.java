package com.duvatec.demoorm;

import com.activeandroid.ActiveAndroid;

public class DuvatecApplication extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

    @Override
    public void onTerminate() {
        ActiveAndroid.dispose();
    }
}