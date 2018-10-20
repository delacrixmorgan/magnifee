package com.delacrixmorgan.zerocost.form

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * com.delacrixmorgan.zerocost.form
 * ZeroCost
 *
 * Created by morgan on 20/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

class FormViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    private var fragments = listOf<Fragment>()

    fun updateDataSet(fragments: List<Fragment>) {
        this.fragments = fragments
    }

    override fun getCount() = fragments.size
    override fun getItem(position: Int) = this.fragments[position]
}