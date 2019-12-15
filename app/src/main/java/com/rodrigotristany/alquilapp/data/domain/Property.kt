package com.rodrigotristany.alquilapp.data.domain

import com.rodrigotristany.alquilapp.ui.home.CatalogModel

class Property(propertyType : PropertyType) : CatalogModel {

    var address : String = ""
    var description : String = ""
    var coveredArea : Double = 0.0
    var numberOfRooms : Int = 0
    var ground : Ground = Ground()
    var urlPictures : MutableList<String> = mutableListOf()
    var type : PropertyType = propertyType

    override var id: String = ""
    override var title : String = ""
    override var city : String = ""
}
