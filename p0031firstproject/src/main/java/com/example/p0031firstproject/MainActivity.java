package com.example.p0031firstproject;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    CheckBox myChb;
    Button myBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myChb = (CheckBox) findViewById(R.id.myChb);
        myBtn = (Button) findViewById(R.id.run);

        myBtn.setOnClickListener(this);


    }
    public void onClick(View v) {

        if (myChb.isChecked()) {

            Toast.makeText(MainActivity.this, "nazhata knopka, vsem sasat!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setClass(this, splashAct.class);

            startActivity(intent);
            finish();
        }



    }

}



