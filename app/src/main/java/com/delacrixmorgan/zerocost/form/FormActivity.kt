package com.delacrixmorgan.zerocost.form

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.delacrixmorgan.zerocost.R
import kotlinx.android.synthetic.main.activity_form.*

/**
 * com.delacrixmorgan.zerocost.form
 * ZeroCost
 *
 * Created by morgan on 20/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

class FormActivity : AppCompatActivity() {
    companion object {
        fun newLaunchIntent(context: Context) = Intent(context, FormActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        setupLayouts()
    }

    private val fragments = listOf(
            FormDetailsFragment.newInstance(),
            FormHoldFragment.newInstance(),
            FormBankFragment.newInstance()
    )

    private fun setupLayouts() {
        val adapter = FormViewPagerAdapter(supportFragmentManager)
        adapter.updateDataSet(this.fragments)

        this.viewPager.adapter = adapter
        this.inkIndicator.setViewPager(this.viewPager)
    }
}