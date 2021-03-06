package com.phongbm.dynamicmodulehilt

import androidx.lifecycle.ViewModel
import com.phongbm.dmh.domain.SomethingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by PhongBM on 08/23/2021
 */

@HiltViewModel
class OneViewModel
@Inject
constructor(private val somethingRepository: SomethingRepository) : ViewModel() {
    fun doSomething() {
        somethingRepository.doSomething()
    }

}