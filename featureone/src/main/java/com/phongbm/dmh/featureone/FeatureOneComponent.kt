package com.phongbm.dmh.featureone

import com.phongbm.dynamicmodulehilt.FeatureOneModuleDependencies
import dagger.Component

/**
 * Created by PhongBM on 08/23/2021
 */

@Component(dependencies = [FeatureOneModuleDependencies::class])
interface FeatureOneComponent {
    @Component.Factory
    interface Builder {
        fun create(featureOneModuleDependencies: FeatureOneModuleDependencies): FeatureOneComponent
    }

    fun inject(fragment: FeatureOneFragment)

}