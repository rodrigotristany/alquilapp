package com.rodrigotristany.alquilapp.ui.home

import javax.inject.Inject

class MainPresenter(private val view: MainMVPView) : MainMVPPresenter {

    override fun loadData() {
        view.showToast("You are learning!!")
    }

}