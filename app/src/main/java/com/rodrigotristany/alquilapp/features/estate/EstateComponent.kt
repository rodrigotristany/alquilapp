package com.rodrigotristany.alquilapp.features.estate

import com.rodrigotristany.alquilapp.di.ApplicationComponent
import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.detail.EstateDetailActivity
import com.rodrigotristany.alquilapp.features.estate.favorites.FavoritesEstateActivity
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [EstateModule::class])
interface EstateComponent {
    fun inject(favoritesEstateActivity: FavoritesEstateActivity)
    fun inject(estateDetailActivity: EstateDetailActivity)
}
