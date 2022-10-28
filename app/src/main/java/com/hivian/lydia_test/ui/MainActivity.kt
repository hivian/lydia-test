package com.hivian.lydia_test.ui

import android.os.Bundle
import com.hivian.lydia_test.R
import com.hivian.lydia_test.core.services.base.ActivityBase
import com.hivian.lydia_test.core.services.navigation.INavigationService
import com.hivian.lydia_test.databinding.ActivityMainBinding
import com.talentsoft.android.toolkit.core.IoC

class MainActivity : ActivityBase<ActivityMainBinding>(R.layout.activity_main) {

    private val navigationService: INavigationService
        get() = IoC.resolve()

    override fun onCreate(savedInstanceState: Bundle?) {
        navigationService.navigationActivity = this

        super.onCreate(savedInstanceState)
    }

}
