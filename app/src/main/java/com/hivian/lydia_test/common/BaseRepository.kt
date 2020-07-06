package com.hivian.lydia_test.common

open class BaseRepository {

    suspend fun <T : Any>safeApiCall(call: suspend () -> T) : Resource<T> {
        return try {
            val response = call.invoke()
            Resource.Success(
                response
            )
        } catch (exception: Exception) {
            Resource.Error("Network error")
        }
    }

}