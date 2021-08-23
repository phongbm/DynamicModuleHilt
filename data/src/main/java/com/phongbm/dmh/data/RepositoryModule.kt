package com.phongbm.dmh.data

import com.phongbm.dmh.domain.SomethingRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by PhongBM on 08/23/2021
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindSomethingRepository(impl: SomethingRepositoryImpl): SomethingRepository

}