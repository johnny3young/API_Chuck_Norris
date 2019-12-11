package com.young.api_chuck_norris.presenter

import com.young.api_chuck_norris.MainContract

class MainPresenter(private val view: MainContract.view) : MainContract.presenter {

    override fun buttonClicked() {
        view.updateTextField(2,"jajajajaja....")
        view.showToast("Esto seria un chiste")
    }
}