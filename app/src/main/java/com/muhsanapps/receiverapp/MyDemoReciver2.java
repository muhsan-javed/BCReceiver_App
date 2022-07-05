package com.muhsanapps.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyDemoReciver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (isOrderedBroadcast()){

            int initialCode = getResultCode();
            String initialData = getResultData();
            Bundle bundle = getResultExtras(true);
            String stringExtra= bundle.getString("message_key");

            initialCode++;
            stringExtra+="->BR2";

            String output = "initial Code: "+ initialCode +"\n" +
                    "initial Data: "+ initialData+ "\n"+
                    "string extra: "+ stringExtra;

            Toast.makeText(context, output, Toast.LENGTH_SHORT).show();
            Log.d("TAG", "onReceiver: "+ output);

            initialData = "BR2";
            bundle.putString("message_key", stringExtra);

            setResult(initialCode, initialData, bundle);

        }


        //Toast.makeText(context, "My Demo Receiver called: Receiver App  2", Toast.LENGTH_SHORT).show();

       /* if ("com.muhsanapps.receiverapp.ACTION_SEND".equals(intent.getAction())) {

            String extraData = intent.getStringExtra("com.muhsanapps.EXTRA_DATA");

            Toast.makeText(context, "From Receiver: " + extraData, Toast.LENGTH_LONG).show();
        }*/

    }
}
