package com.muhsanapps.receiverapp;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class MyDemoReciver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //NOTIFICATION
        if (isOrderedBroadcast()){

            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "ChannelId")
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setContentText("This is demo message")
                    .setContentTitle("Title BCR");

            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

            manager.notify(1, builder.build());

        }


       // Toast.makeText(context, "My Demo Receiver called: Receiver App 1", Toast.LENGTH_SHORT).show();

      /*  if (isOrderedBroadcast()){

            int initialCode = getResultCode();
            String initialData = getResultData();
            Bundle bundle = getResultExtras(true);
            String stringExtra= bundle.getString("message_key");

            initialCode++;
            stringExtra+="->BR1";

            String output = "initial Code: "+ initialCode +"\n" +
                    "initial Data: "+ initialData+ "\n"+
                    "string extra: "+ stringExtra;

            Toast.makeText(context, output, Toast.LENGTH_SHORT).show();
            Log.d("TAG", "onReceiver: "+ output);

            initialData = "BR1";
            bundle.putString("message_key", stringExtra);

            setResult(initialCode, initialData, bundle);

        }*/

       /* if ("com.muhsanapps.receiverapp.ACTION_SEND".equals(intent.getAction())) {

            String extraData = intent.getStringExtra("com.muhsanapps.EXTRA_DATA");

            Toast.makeText(context, "From Receiver: " + extraData, Toast.LENGTH_LONG).show();
        }*/

    }
}
