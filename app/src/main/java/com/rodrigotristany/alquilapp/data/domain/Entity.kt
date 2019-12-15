package com.rodrigotristany.alquilapp.data.domain

open class Entity{
    var id : String = ""
    open var fullName : String = ""
    var dateOfBirth : String = ""
    var address : String = ""
    var city : String = ""
    var province : String = ""
    var phones : List<String> = listOf()
    var urlImage : String = ""
    var identity : String = ""
    var email : String = ""

    var fullAddress = "$address, $city, $province"
}
