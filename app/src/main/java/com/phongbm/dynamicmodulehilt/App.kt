package com.phongbm.dynamicmodulehilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by PhongBM on 08/23/2021
 */

@HiltAndroidApp
class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}