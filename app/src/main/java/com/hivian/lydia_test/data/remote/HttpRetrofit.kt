package com.hivian.lydia_test.data.remote

import com.hivian.lydia_test.data.model.Results


class HttpRetrofit(private val service: ApiService) {

    suspend fun fetchRandomUsers(results: Int = 10): Results =
        service.fetchRandomUsers(results = results)

}