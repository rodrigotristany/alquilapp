package com.rodrigotristany.alquilapp.data.provider

import com.rodrigotristany.alquilapp.data.api.EstateApi
import com.rodrigotristany.alquilapp.data.cache.EstateCache

class EstateProvider(
    val propertyApi : EstateApi,
    val propertyCache : EstateCache
) {
    fun getEstates() {

    }
}