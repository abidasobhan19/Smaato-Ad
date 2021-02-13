package com.forbitbd.test;

import android.app.Application;

import com.smaato.sdk.core.Config;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.log.LogLevel;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Config config = Config.builder()
                // log errors only
                .setLogLevel(LogLevel.ERROR)
                // allow HTTPS traffic only
                .setHttpsOnly(true)
                .build();
        // initialize the Smaato SDK
        SmaatoSdk.init(this, config, "1100048073");
        SmaatoSdk.setGPSEnabled(true);
    }
}
