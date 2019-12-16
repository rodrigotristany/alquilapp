package com.rodrigotristany.alquilapp.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estate")
data class Estate(
    @PrimaryKey val id : String,
    @ColumnInfo(name = "title") val title : String,
    @ColumnInfo(name = "city") val city : String,
    @ColumnInfo(name = "address") val address : String,
    @ColumnInfo(name = "description") val description : String,
    @ColumnInfo(name = "covered_area") val coveredArea : Double,
    @ColumnInfo(name = "number_of_rooms") val numberOfRooms : Int,
    @ColumnInfo(name = "ground_id") val groundId : Int) {
    lateinit var urlPictures : MutableList<String>
}