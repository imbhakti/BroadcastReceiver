package com.test.broadcastreceivers
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.broadcastreceivers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var myBroadcastReceivers: MyBroadcastReceivers
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegisterToBR.setOnClickListener {
            myBroadcastReceivers = MyBroadcastReceivers()
            var intentFilter= IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            registerReceiver(myBroadcastReceivers, intentFilter)
        }

        binding.btnUnregisterToBR.setOnClickListener {
            unregisterReceiver(myBroadcastReceivers)
        }
    }
}
