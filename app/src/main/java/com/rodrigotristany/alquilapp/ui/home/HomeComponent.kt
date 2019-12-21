package com.rodrigotristany.alquilapp.ui.home

import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = [HomeModule::class])
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}