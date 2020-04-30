package com.rodrigotristany.alquilapp.features.estate.detail.di

import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.detail.EstateDetailMVP
import com.rodrigotristany.alquilapp.features.estate.detail.view.EstateDetailPresenter
import dagger.Module
import dagger.Provides

@Module
class EstateDetailModule {
    @PerActivity
    @Provides
    fun provideEstateDetailPresenter() : EstateDetailMVP.Presenter {
        return EstateDetailPresenter()
    }
}
