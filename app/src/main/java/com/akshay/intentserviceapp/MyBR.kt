package com.akshay.intentserviceapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView

class MyBR(var iv: ImageView):BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        iv.setImageBitmap(bmp)
    }
}