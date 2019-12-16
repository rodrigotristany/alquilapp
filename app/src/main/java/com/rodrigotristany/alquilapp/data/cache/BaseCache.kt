package com.rodrigotristany.alquilapp.data.cache

interface BaseCache {
    fun checkCacheTimeout() : Boolean
}