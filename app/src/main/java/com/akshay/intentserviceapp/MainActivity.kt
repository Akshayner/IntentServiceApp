package com.akshay.intentserviceapp

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        get.setOnClickListener {
            val a = Intent(this@MainActivity,MyIService::class.java)
            startService(a)

            val i = IntentFilter()
            i.addAction("done")
            registerReceiver(MyBR(iv),i)

        }
    }
}
