package com.rodrigotristany.alquilapp

import android.app.Application
import com.rodrigotristany.alquilapp.di.AppComponent
import com.rodrigotristany.alquilapp.di.DaggerAppComponent

open class AlquilAppApplication : Application() {

    // Instance of the AppComponent that will be used by all the Activities in the project
//    val appComponent: AppComponent by lazy {
//        initializeComponent()
//    }
//
//    open fun initializeComponent(): AppComponent {
//        // Creates an instance of AppComponent using its Factory constructor
//        // We pass the applicationContext that will be used as Context in the graph
//        return DaggerAppComponent.factory().create(applicationContext)
//    }
}