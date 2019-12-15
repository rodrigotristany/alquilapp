package com.rodrigotristany.alquilapp.di

import com.rodrigotristany.alquilapp.data.DataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class),(DataModule::class),(DomainModule::class)])
interface AppComponent {
    fun inject(app: App)
}