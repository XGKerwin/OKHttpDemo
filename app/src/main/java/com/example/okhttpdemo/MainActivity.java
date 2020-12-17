package com.example.okhttpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    String TAG = "aa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OkHttpTo okHttpTo = new OkHttpTo();
        okHttpTo.setUrl("put/token")
                .setType(3)
                .setJSONObject("type",1)
                .setHeader("432c9f83f9892485c3d92a4fca451e7b")
                .setJSONObject("type",1)
                .setListener(new Listener() {
                    @Override
                    public void onResponse(Object response) {
                        Log.i(TAG, "onResponse: "+response);
                    }

                    @Override
                    public void onErrorResponse(IOException error) {

                    }
                }).start();


    }
}