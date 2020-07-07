package com.hivian.lydia_test.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hivian.lydia_test.data.model.domain.RandomUserDomain

class DetailViewModelFactory(private val randomUser: RandomUserDomain)
    : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailViewModel(randomUser) as T
    }
}