package com.rodrigotristany.alquilapp.domain.actors

class User : Entity() {
    var name : String = ""
    var lastName : String = ""

    override var fullName : String = "$name $lastName"
}
