package com.delacrixmorgan.zerocost

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        Handler().postDelayed({
            val intent = NavigationActivity.newLaunchIntent(this)
            startActivity(intent)
            finish()
        }, 1000)
    }
}