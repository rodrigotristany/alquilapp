package com.rodrigotristany.alquilapp.features.estate.favorites.di

import com.rodrigotristany.alquilapp.di.ApplicationComponent
import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.favorites.view.FavoritesEstateActivity
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [FavoritesEstateModule::class])
interface FavoritesEstateComponent {
    fun inject(favoritesEstateActivity: FavoritesEstateActivity)
}
