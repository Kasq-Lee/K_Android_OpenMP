package com.kasq.test.openmp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG="OpenMP_Test";
    static {
        System.loadLibrary("openmp");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG,"------Start------");
        openMp_HelloWord();


    }

    private native void openMp_HelloWord();
}