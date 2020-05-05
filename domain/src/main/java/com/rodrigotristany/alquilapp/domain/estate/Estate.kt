package com.rodrigotristany.alquilapp.domain.estate

import com.rodrigotristany.alquilapp.domain.actors.Realtor

abstract class Estate(
    var buildingType : BuildingType,
    var address : String = "",
    var city: String = "",
    var description : String = "",
    var coveredArea : Double = 0.0,
    var realtor : Realtor = Realtor(),
    var urlPictures : MutableList<String> = mutableListOf())
