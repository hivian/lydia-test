package com.hivian.lydia_test.data.remote

fun getRetrofitApiLayer(): HttpRetrofit = HttpRetrofit(
    RetrofitApiClient().createService(ApiService::class.java)
)