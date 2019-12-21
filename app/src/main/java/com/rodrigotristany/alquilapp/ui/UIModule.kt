package com.rodrigotristany.alquilapp.ui

import com.rodrigotristany.alquilapp.ui.detail.DetailModule
import com.rodrigotristany.alquilapp.ui.home.HomeModule
import dagger.Module

@Module(includes = [DetailModule::class, HomeModule::class])
abstract class UIModule