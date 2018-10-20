package com.delacrixmorgan.zerocost.form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.delacrixmorgan.zerocost.R
import com.delacrixmorgan.zerocost.template.TemplateActivity
import kotlinx.android.synthetic.main.fragment_form_details.*

/**
 * com.delacrixmorgan.zerocost.form
 * ZeroCost
 *
 * Created by morgan on 20/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

class FormBankFragment : Fragment() {

    companion object {
        fun newInstance() = FormBankFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form_bank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.submitButton.setOnClickListener {
            val intent = TemplateActivity.newLaunchIntent(requireContext())
            startActivity(intent)
            this.activity?.finish()
        }
    }
}