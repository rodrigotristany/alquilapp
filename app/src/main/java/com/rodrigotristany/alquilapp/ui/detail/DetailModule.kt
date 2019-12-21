package com.rodrigotristany.alquilapp.ui.detail

import com.rodrigotristany.alquilapp.ui.detail.DetailActivity
import com.rodrigotristany.alquilapp.ui.detail.DetailMVPPresenter
import com.rodrigotristany.alquilapp.ui.detail.DetailMVPView
import com.rodrigotristany.alquilapp.ui.detail.DetailPresenter
import dagger.Module
import dagger.Provides

@Module
class DetailModule(private val activity: DetailActivity) {
    @Provides
    fun provideView() : DetailMVPView {
        return activity
    }

    @Provides
    fun providePresenter() : DetailMVPPresenter {
        return DetailPresenter()
    }
}