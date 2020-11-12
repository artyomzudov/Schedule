package com.example.p0031firstproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashAct extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashAct.this, act1.class);
                startActivity(i);
                finish();
            } //perehod na drugoy ekran
        }, 2*1000); //2 sec
    }
}