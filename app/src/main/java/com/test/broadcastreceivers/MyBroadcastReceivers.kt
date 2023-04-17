package com.test.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceivers: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
       val mode= intent!!.getBooleanExtra("state", false)?:return
        if(mode) {
            Toast.makeText(context, "AIROPLANE MODE- ON", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "AIROPLANE MODE- OFF", Toast.LENGTH_LONG).show()
        }
    }
}











