package com.rodrigotristany.alquilapp.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(val app: Application) {
    @Provides
    @Singleton
    @PerApplication
    fun provideContext() = app
}
