package com.rodrigotristany.alquilapp.domain.actors

class Realtor(
    var id: String = "",
    var fullName: String = "",
    var dateOfBirth: String = "",
    var address: String = "",
    var city: String = "",
    var province: String = "",
    var phones: List<String> = listOf(),
    var urlImage: String = "",
    var identity: String = "",
    var email: String = ""
) {
    fun fullAddress() = "$address, $city, $province"
    fun mainPhone() = phones.first()
}
