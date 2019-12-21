package com.rodrigotristany.alquilapp.utils

import android.app.Activity
import com.rodrigotristany.alquilapp.AlquilAppApplication

val Activity.app: AlquilAppApplication
    get() = application as AlquilAppApplication