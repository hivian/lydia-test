package com.hivian.lydia_test.data.remote

import com.hivian.lydia_test.data.model.Results
import retrofit2.http.*

interface ApiService {

    @GET
    suspend fun fetchRandomUsers(
        @Query("seed") seed: String = "lydia",
        @Query("results") results: Int = 10,
        @Query("page") page: Int = 1): Results

}