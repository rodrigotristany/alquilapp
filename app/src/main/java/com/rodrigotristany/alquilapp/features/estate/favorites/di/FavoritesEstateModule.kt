package com.rodrigotristany.alquilapp.features.estate.favorites.di

import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.favorites.FavoritesEstateMVP
import com.rodrigotristany.alquilapp.features.estate.favorites.view.FavoritesEstatePresenter
import dagger.Module
import dagger.Provides

@Module
class FavoritesEstateModule {
    @PerActivity
    @Provides
    fun provideFavoritesEstatePresenter() : FavoritesEstateMVP.Presenter {
        return FavoritesEstatePresenter()
    }
}
