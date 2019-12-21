package com.rodrigotristany.alquilapp.ui.home

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HomeModule(private val activity: MainActivity) {
    @Provides
    @Singleton
    fun provideView() : MainMVPView {
        return activity
    }
    @Provides
    @Singleton
    fun providePresenter() : MainMVPPresenter {
        return MainPresenter(provideView())
    }
}