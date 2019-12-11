package com.young.api_chuck_norris

interface MainContract {

    //Qué puede hacer la vista???
    interface view {
        fun showToast(message: String)
        fun updateTextField (id: Int, joke: String)
    }

    //Qu{e puede hacer el usuario???
    interface presenter {
        fun buttonClicked()
    }
}