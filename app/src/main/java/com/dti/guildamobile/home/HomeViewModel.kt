package com.dti.guildamobile.home

import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    fun getDogsList(): List<Dog> {
        val dogList = ArrayList<Dog>()
        dogList.add(Dog(1, "https://placedog.net/501"))
        dogList.add(Dog(22, "https://placedog.net/500"))

        return dogList
    }

}