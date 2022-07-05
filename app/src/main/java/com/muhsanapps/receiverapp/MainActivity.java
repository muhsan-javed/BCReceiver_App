package com.muhsanapps.receiverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    MyDemoReciver  myDemoReciver = new MyDemoReciver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  IntentFilter intentFilter = new IntentFilter("com.muhsanapps.receiverapp.ACTION_SEND");
        registerReceiver(myDemoReciver, intentFilter);*/
    }


   /* @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myDemoReciver);

    }*/
}