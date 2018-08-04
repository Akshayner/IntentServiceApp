package com.akshay.intentserviceapp

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp : Bitmap? = null
class MyIService: IntentService("") {
    override fun onHandleIntent(p0: Intent?) {
        val url = URL("https://www.bmw-asia.com/content/dam/bmw/common/all-models/m-series/m4-convertible/2017/images-and-videos/images/BMW-m4-convertible-images-and-videos-1920x1200-06.jpg.asset.1487344406677.jpg")
        var isp = url.openStream()
        bmp = BitmapFactory.decodeStream(isp)


        //after bmp object created, we have to set broadcast receiver
        val i = Intent()
        i.action = "done"
        sendBroadcast(i)
    }
}