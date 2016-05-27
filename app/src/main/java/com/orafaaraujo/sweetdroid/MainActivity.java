package com.orafaaraujo.sweetdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crash report is enable only if the build is for QA or Production.
        // This avoid frequent (and annoying) reports on development time!
        if (BuildConfig.REPORT_CRASH) {
            // Start crash report!
        }
    }
}
