package com.rodrigotristany.alquilapp.di

import com.rodrigotristany.alquilapp.AlquilAppApplication
import dagger.Component

@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(app: AlquilAppApplication)
}
