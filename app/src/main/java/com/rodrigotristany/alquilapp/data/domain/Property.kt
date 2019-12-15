package com.rodrigotristany.alquilapp.data.domain

class Property {
    var address : String = ""
    var city : String = ""
    var description : String = ""
    var title : String = ""
    var coveredArea : Double = 0.0
    var numberOfRooms : Int = 0
    var ground : Ground = Ground()
    var urlPictures : MutableList<String> = mutableListOf()
}
