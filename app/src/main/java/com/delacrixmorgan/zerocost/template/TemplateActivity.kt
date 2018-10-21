package com.delacrixmorgan.zerocost.template

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.delacrixmorgan.zerocost.R
import kotlinx.android.synthetic.main.activity_template.*

/**
 * com.delacrixmorgan.zerocost.template
 * ZeroCost
 *
 * Created by morgan on 20/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

class TemplateActivity : AppCompatActivity() {
    companion object {
        const val FALLBACK_LINK = "http://docs.google.com/gview?embedded=true&url=https://www.hba.org.my/laws/housing_reg/2002/Schedule_G.pdf"
        fun newLaunchIntent(context: Context) = Intent(context, TemplateActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template)

        this.webView.loadUrl(FALLBACK_LINK)
    }
}