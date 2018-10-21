package com.delacrixmorgan.zerocost.api

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
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
        const val BASE_URL = "https://emiror.serveo.net/"

        fun create(context: Context): MagnifeeApiService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(MagnifeeApiService::class.java)
        }
    }

    @FormUrlEncoded
    @POST("gen")
    fun getGeneratedPdf(
        @Field("buyerFullname") fullName: String = "Aerith",
        @Field("buyerNric") nric: String = "920215-10-9855",
        @Field("buyerAddress") address: String = "2A, Jalan Stesen Sentral 2, Kuala Lumpur",
        @Field("buyerIncomeTax") incomeTax: String = "1234567890"
    ) {

    }
}