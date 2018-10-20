package com.delacrixmorgan.zerocost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        val intent = NavigationActivity.newLaunchIntent(this)
        startActivity(intent)
        finish()
    }
}
