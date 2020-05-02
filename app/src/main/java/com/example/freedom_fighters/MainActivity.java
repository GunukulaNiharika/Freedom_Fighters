package com.example.freedom_fighters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent Activity_2intent=new Intent(getApplicationContext(),Activity_2.class);
                startActivity(Activity_2intent);
                finish();
            }
        },3000);
    }
}
