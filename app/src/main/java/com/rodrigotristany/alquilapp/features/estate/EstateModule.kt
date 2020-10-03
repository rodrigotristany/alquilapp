package com.rodrigotristany.alquilapp.features.estate

import com.rodrigotristany.alquilapp.di.PerActivity
import com.rodrigotristany.alquilapp.features.estate.detail.EstateDetailMVP
import com.rodrigotristany.alquilapp.features.estate.detail.EstateDetailPresenter
import com.rodrigotristany.alquilapp.features.estate.favorites.FavoritesEstateMVP
import com.rodrigotristany.alquilapp.features.estate.favorites.FavoritesEstatePresenter
import dagger.Module
import dagger.Provides

@Module
class EstateModule {
    @PerActivity
    @Provides
    fun provideEstateDetailPresenter() : EstateDetailMVP.Presenter {
        return EstateDetailPresenter()
    }

    @PerActivity
    @Provides
    fun provideFavoritesEstatePresenter() : FavoritesEstateMVP.Presenter {
        return FavoritesEstatePresenter()
    }
}
