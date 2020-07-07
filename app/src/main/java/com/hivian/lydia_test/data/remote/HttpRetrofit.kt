package com.hivian.lydia_test.data.remote

import com.hivian.lydia_test.data.model.dto.RandomUserDTO


class HttpRetrofit(private val service: ApiService) {

    suspend fun fetchRandomUsers(results: Int = 20): List<RandomUserDTO> =
        service.fetchRandomUsers(results = results).results

}