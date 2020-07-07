package com.hivian.lydia_test.data.remote

import com.hivian.lydia_test.data.model.dto.Results
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/1.0")
    suspend fun fetchRandomUsers(
        @Query("seed") seed: String = "lydia",
        @Query("results") results: Int = 20,
        @Query("page") page: Int = 1): Results

}