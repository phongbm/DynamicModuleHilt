package com.phongbm.dmh.featureone

import androidx.lifecycle.ViewModel
import com.phongbm.dmh.domain.SomethingRepository
import javax.inject.Inject

/**
 * Created by PhongBM on 08/23/2021
 */

class FeatureOneViewModel
@Inject
constructor(private val somethingRepository: SomethingRepository) : ViewModel() {
    fun doSomething() {
        somethingRepository.doSomething()
    }

}