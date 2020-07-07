package com.hivian.lydia_test.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.hivian.lydia_test.application.App
import com.hivian.lydia_test.common.BaseRepository
import com.hivian.lydia_test.common.Resource
import com.hivian.lydia_test.data.db.RandomUsersDatabase
import com.hivian.lydia_test.data.model.domain.RandomUserDomain
import com.hivian.lydia_test.data.model.dto.RandomUserDTO
import com.hivian.lydia_test.data.remote.getRetrofitApiLayer

class RandomUsersRepository: BaseRepository() {

    private val httpRetrofit = getRetrofitApiLayer()

    private val randomsUsersDao = RandomUsersDatabase.getInstance(App.get()).randomUsersDao()

    val randomsUsersLocal: LiveData<List<RandomUserDomain>> =
        Transformations.map(randomsUsersDao.getAllRandomUsers()) {
            Mapper.mapDTOToDomain(it)
        }

    suspend fun fetchRandomUsers(): Resource<List<RandomUserDTO>> {
        val safeCall = safeApiCall {
            httpRetrofit.fetchRandomUsers()
        }
        if (safeCall is Resource.Success)
            saveRandomUsers(safeCall.data)
        return safeCall
    }

    private suspend fun saveRandomUsers(randomUserList: List<RandomUserDTO>) {
        randomsUsersDao.upsert(randomUserList)
    }

}