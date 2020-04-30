package com.rodrigotristany.alquilapp.features.estate.detail.di

import com.rodrigotristany.alquilapp.di.ApplicationComponent
import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.detail.view.EstateDetailActivity
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [EstateDetailModule::class])
interface EstateDetailComponent {
    fun inject(estateDetailActivity: EstateDetailActivity)
}
