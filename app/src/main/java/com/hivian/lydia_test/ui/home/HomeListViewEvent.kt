package com.hivian.lydia_test.ui.home

import com.hivian.lydia_test.data.model.domain.RandomUserDomain


sealed class HomeListViewEvent {

    data class OpenDetailView(val randomUser: RandomUserDomain) : HomeListViewEvent()

}