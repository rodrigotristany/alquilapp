package com.rodrigotristany.alquilapp.features.home.di

import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.home.HomeMVP
import com.rodrigotristany.alquilapp.features.home.view.HomePresenter
import dagger.Module
import dagger.Provides

@Module
class HomeModule {
    @PerActivity
    @Provides
    fun provideHomePresenter() : HomeMVP.Presenter {
        return HomePresenter()
    }
}
