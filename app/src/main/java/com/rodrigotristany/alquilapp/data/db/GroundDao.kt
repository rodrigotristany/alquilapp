package com.rodrigotristany.alquilapp.data.db

import androidx.room.Dao

@Dao
interface GroundDao {
    fun groundById(id: String)
}