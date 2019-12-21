package com.rodrigotristany.alquilapp

import android.app.Application
import com.rodrigotristany.alquilapp.di.AppComponent
import com.rodrigotristany.alquilapp.di.AppModule
import com.rodrigotristany.alquilapp.di.DaggerAppComponent

open class AlquilAppApplication : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}