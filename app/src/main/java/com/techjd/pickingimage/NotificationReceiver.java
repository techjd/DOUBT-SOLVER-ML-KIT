package com.techjd.pickingimage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String url = "https://www.youtube.com/channel/UChsnwBNAFpi3VfHoVRkMb8A?view_as=subscriber";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));


    }
}
