package com.rodrigotristany.alquilapp.di

import com.rodrigotristany.alquilapp.AlquilAppApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//La utiliza dagger para llevar un control de todas las
//dependencias dentro del código

@Module
class AppModule(val app: AlquilAppApplication) {
    @Provides
    @Singleton
    @PerApplication
    fun provideContext() = app
}