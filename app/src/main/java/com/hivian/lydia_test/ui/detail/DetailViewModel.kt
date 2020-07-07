package com.hivian.lydia_test.ui.detail

import androidx.lifecycle.MutableLiveData
import com.hivian.lydia_test.common.ScopedViewModel
import com.hivian.lydia_test.data.model.domain.RandomUserDomain


class DetailViewModel(randomUser: RandomUserDomain): ScopedViewModel() {

    val data = MutableLiveData(randomUser)

}