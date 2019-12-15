package com.rodrigotristany.alquilapp.data.domain

class User : Entity() {
    var name : String = ""
    var lastName : String = ""

    override var fullName : String = "$name $lastName"
}
