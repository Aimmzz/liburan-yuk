package com.aimcode.liburanyuk.core.di

import android.content.Context
import com.aimcode.liburanyuk.core.data.TourismRepository
import com.aimcode.liburanyuk.core.data.source.local.LocalDataSource
import com.aimcode.liburanyuk.core.data.source.local.room.TourismDatabase
import com.aimcode.liburanyuk.core.data.source.remote.RemoteDataSource
import com.aimcode.liburanyuk.core.domain.repository.ITourismRepository
import com.aimcode.liburanyuk.core.domain.usecase.TourismInteractor
import com.aimcode.liburanyuk.core.domain.usecase.TourismUseCase
import com.aimcode.liburanyuk.core.utils.AppExecutors
import com.aimcode.liburanyuk.core.utils.JsonHelper

object Injection {
    private fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}