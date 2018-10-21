package com.delacrixmorgan.zerocost.api

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

/**
 * com.delacrixmorgan.zerocost.api
 * ZeroCost
 *
 * Created by morgan on 21/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

interface MagnifeeApiService {
    companion object {
        const val BASE_URL = "http://192.168.100.86:8080/"

        fun create(context: Context): MagnifeeApiService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(MagnifeeApiService::class.java)
        }
    }

    @POST("gen")
    fun getGeneratedPdf() {

    }
}