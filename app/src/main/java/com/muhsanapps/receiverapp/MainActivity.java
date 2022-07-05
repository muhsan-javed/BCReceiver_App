package com.muhsanapps.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    //MyDemoReciver  myDemoReciver = new MyDemoReciver();

    //MyDemoReciver2 myDemoReciver2 = new MyDemoReciver2();

    BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            textView.setText("UI updated");
            if (isOrderedBroadcast())
                abortBroadcast();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
      /*  IntentFilter intentFilter = new IntentFilter("com.muhsanapps.receiverapp.ACTION_SEND");
        intentFilter.setPriority(80);
        registerReceiver(myDemoReciver2, intentFilter);*/


      /*  IntentFilter intentFilter = new IntentFilter("com.muhsanapps.receiverapp.ACTION_SEND");
        registerReceiver(myDemoReciver, intentFilter);*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("com.muhsanapps.receiverapp.ACTION_SEND");
        intentFilter.setPriority(80);
        registerReceiver(mReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mReceiver);

    }

   /* @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myDemoReciver);

    }*/
}