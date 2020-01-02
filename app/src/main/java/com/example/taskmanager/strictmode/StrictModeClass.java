package com.example.taskmanager.strictmode;

import android.os.StrictMode;

public class StrictModeClass {
    public static void  StrictMode(){
        new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();

        StrictMode.setThreadPolicy(policy);
    }
}
