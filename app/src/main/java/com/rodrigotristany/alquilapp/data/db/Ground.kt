package com.rodrigotristany.alquilapp.data.db

import androidx.room.Entity

@Entity(tableName = "ground")
data class Ground(
    var id : String,
    var area : Double,
    var lengthArea : Double,
    var widthArea : Double,
    var Orientation : String,
    var borderStreets : String,
    var water : Boolean,
    var gas : Boolean,
    var internet : Boolean,
    var tv : Boolean,
    var electricity : Boolean,
    var services : String)