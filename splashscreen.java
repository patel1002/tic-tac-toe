package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashscreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
}

