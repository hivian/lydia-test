package com.hivian.lydia_test.application

import android.app.Application
import com.github.ajalt.timberkt.Timber

class App: Application() {

    companion object {
        private lateinit var INSTANCE: App

        fun get() : App = INSTANCE
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        Timber.plant(Timber.DebugTree())
    }

}