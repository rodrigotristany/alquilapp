package com.rodrigotristany.alquilapp.data.cache

import com.rodrigotristany.alquilapp.data.domain.Estate

interface EstateCache : BaseCache{
    fun estates() : List<Estate>
}