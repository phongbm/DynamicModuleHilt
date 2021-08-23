package com.phongbm.dynamicmodulehilt

import com.phongbm.dmh.domain.SomethingRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by PhongBM on 08/23/2021
 */

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FeatureOneModuleDependencies {
    fun somethingRepository(): SomethingRepository

}