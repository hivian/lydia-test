package com.hivian.lydia_test.ui.home

import androidx.lifecycle.LiveData
import com.hivian.lydia_test.common.Resource
import com.hivian.lydia_test.common.ScopedViewModel
import com.hivian.lydia_test.common.SingleLiveData
import com.hivian.lydia_test.data.RandomUsersRepository
import com.hivian.lydia_test.data.model.domain.RandomUserDomain
import com.hivian.lydia_test.ui.NetworkState
import kotlinx.coroutines.launch

class HomeViewModel: ScopedViewModel() {

    private val randomUsersRepository = RandomUsersRepository()

    var data : LiveData<List<RandomUserDomain>> = randomUsersRepository.randomsUsersLocal

    val networkState = SingleLiveData<NetworkState>()

    val clickEvent = SingleLiveData<HomeListViewEvent>()

    init {
        fetchRandomUsers()
    }

    fun fetchRandomUsers() = launch {
        networkState.value = NetworkState.Loading
        val resultList = randomUsersRepository.fetchRandomUsers()
        when (resultList) {
            is Resource.Success -> {
                networkState.value = NetworkState.Success
            }
            is Resource.Error -> networkState.value = NetworkState.Error(resultList.message)
        }
    }

    fun openRandomUserDetail(randomUser: RandomUserDomain) {
        clickEvent.value = HomeListViewEvent.OpenDetailView(randomUser)
    }

}