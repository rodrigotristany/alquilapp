package com.rodrigotristany.alquilapp

import android.app.Application
import com.rodrigotristany.alquilapp.di.ApplicationComponent
import com.rodrigotristany.alquilapp.di.ApplicationModule
import com.rodrigotristany.alquilapp.di.DaggerApplicationComponent

open class AlquilAppApplication : Application() {
    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        initInjector()
    }

    private fun initInjector() {
        applicationComponent.inject(this)
    }
}
