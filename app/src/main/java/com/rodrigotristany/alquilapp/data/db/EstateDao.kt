package com.rodrigotristany.alquilapp.data.db

import androidx.room.Dao
import androidx.room.Query
import com.rodrigotristany.alquilapp.data.cache.EstateCache
import com.rodrigotristany.alquilapp.data.domain.Estate

@Dao
interface EstateDao : EstateCache{
    @Query("SELECT * From estate")
    override fun estates(): List<Estate>
}