package com.example.muaz.qrcodescanner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sIntent = new Intent(LoadingScreen.this, StartActivity.class);
                startActivity(sIntent);
                //startActivity(new Intent(getApplicationContext(), StartActivity.class));
                finish();
            }
        }, 3000L);
    }
}
