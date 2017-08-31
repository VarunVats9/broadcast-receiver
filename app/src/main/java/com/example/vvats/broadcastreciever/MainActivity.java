package com.example.vvats.broadcastreciever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBroadcast(View view) {
        Intent intent = new Intent();
        intent.setAction("com.varun.action.myown.RECEIVE");
        intent.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(intent);
    }
}
