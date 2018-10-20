package com.delacrixmorgan.zerocost.form

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.delacrixmorgan.zerocost.R
import kotlinx.android.synthetic.main.fragment_form_pdf.*

/**
 * com.delacrixmorgan.zerocost.form
 * ZeroCost
 *
 * Created by morgan on 20/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

class FormPdfFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form_pdf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}