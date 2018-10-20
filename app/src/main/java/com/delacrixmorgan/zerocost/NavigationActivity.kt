package com.delacrixmorgan.zerocost

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.delacrixmorgan.zerocost.form.FormActivity
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {
    companion object {
        fun newLaunchIntent(context: Context) = Intent(context, NavigationActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        this.generateButton.setOnClickListener {
            val intent = FormActivity.newLaunchIntent(this)
            startActivity(intent)
        }
    }
}