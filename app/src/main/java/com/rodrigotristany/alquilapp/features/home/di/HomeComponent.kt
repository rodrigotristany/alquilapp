package com.rodrigotristany.alquilapp.features.home.di

import com.rodrigotristany.alquilapp.di.ApplicationComponent
import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.home.view.HomeActivity
import dagger.Component


@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [HomeModule::class])
interface HomeComponent {
    fun inject(estateListActivity: HomeActivity)
}
