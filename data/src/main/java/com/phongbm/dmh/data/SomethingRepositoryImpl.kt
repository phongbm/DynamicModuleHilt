package com.phongbm.dmh.data

import android.util.Log
import com.phongbm.dmh.domain.SomethingRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 08/23/2021
 */

@Singleton
class SomethingRepositoryImpl
@Inject
constructor() : SomethingRepository {
    companion object {
        private const val TAG = "SomethingRepositoryImpl"
    }

    override fun doSomething() {
        Log.d(TAG, "doSomething()...")
    }

}