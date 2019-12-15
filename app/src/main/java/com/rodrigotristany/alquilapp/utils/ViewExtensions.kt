package com.rodrigotristany.alquilapp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(resource: Int) : View {
    return LayoutInflater.from(this.context).inflate(resource, this, false)
}