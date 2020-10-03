package com.rodrigotristany.alquilapp.domain

interface CatalogItem {
    var urlPictures : MutableList<String>
    var address : String
    var city: String
    var description : String
    var realtorName : String
    var realtorImage : String
    var realtorPhone : String
    var price : Double
    var title : String
}
