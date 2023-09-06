package com.leo.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();

        h.postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);
    }
}