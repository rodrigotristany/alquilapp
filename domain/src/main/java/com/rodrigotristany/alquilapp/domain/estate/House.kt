package com.rodrigotristany.alquilapp.domain.estate

import com.rodrigotristany.alquilapp.domain.CatalogItem

class House : Estate(BuildingType.HOUSE), CatalogItem {
    override var realtorName: String = realtor.fullName
    override var realtorImage: String = realtor.urlImage
    override var realtorPhone: String = realtor.mainPhone()
    override var price: Double = 0.0
    override var title: String = ""
}
