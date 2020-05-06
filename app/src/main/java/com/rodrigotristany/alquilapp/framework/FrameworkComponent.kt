package com.rodrigotristany.alquilapp.framework

import com.rodrigotristany.alquilapp.di.ApplicationComponent
import dagger.Component

@Component(dependencies = [ApplicationComponent::class], modules = [FrameworkModule::class])
interface FrameworkComponent {
}
