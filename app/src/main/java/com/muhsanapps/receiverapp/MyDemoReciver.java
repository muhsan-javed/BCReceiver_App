package com.muhsanapps.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyDemoReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "My Demo Receiver called: Receiver App", Toast.LENGTH_SHORT).show();
        
       /* if ("com.muhsanapps.receiverapp.ACTION_SEND".equals(intent.getAction())) {

            String extraData = intent.getStringExtra("com.muhsanapps.EXTRA_DATA");

            Toast.makeText(context, "From Receiver: " + extraData, Toast.LENGTH_LONG).show();
        }*/

    }
}
