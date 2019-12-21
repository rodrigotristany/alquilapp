package com.rodrigotristany.alquilapp.di

import com.rodrigotristany.alquilapp.AlquilAppApplication
import com.rodrigotristany.alquilapp.business.BusinessModule
import com.rodrigotristany.alquilapp.data.DataModule
import com.rodrigotristany.alquilapp.ui.UIModule
import com.rodrigotristany.alquilapp.ui.home.HomeComponent
import com.rodrigotristany.alquilapp.ui.home.HomeModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(app: AlquilAppApplication)
    fun plus(homeModule: HomeModule) : HomeComponent
}