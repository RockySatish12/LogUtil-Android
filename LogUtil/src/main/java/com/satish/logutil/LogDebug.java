package com.satish.logutil;

import android.util.Log;

public class LogDebug {

    public static final String TAG = "SUPER_AWESOME_APP";

    public static void log(String message){
        Log.d(TAG, "log: " + message);
    }


}
