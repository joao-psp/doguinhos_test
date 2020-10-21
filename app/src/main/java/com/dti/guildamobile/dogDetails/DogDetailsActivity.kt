package com.dti.guildamobile.dogDetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.dti.guildamobile.R
import kotlinx.android.synthetic.main.activity_dog_details.*

class DogDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_details)

        Glide.with(this)
            .load("https://placedog.net/501?random")
            .into(ivDog)
    }
}