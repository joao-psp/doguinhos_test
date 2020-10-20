package com.dti.guildamobile.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.dti.guildamobile.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: AppCompatActivity() {
    private lateinit var viewModel: HomeViewModel
    private lateinit var itemDogAdapter: ItemDogAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        configureRecyclerView()
    }

    private fun configureRecyclerView() {
        itemDogAdapter = ItemDogAdapter(viewModel.getDogsList(), ::itemCliqueRecyclerViewDog)

        rcvDogs.layoutManager = GridLayoutManager(this, 2)
        rcvDogs.adapter = itemDogAdapter
    }

    private fun itemCliqueRecyclerViewDog(dog: Dog) {
        Toast.makeText(applicationContext, "CLIQUEI ${dog.id}", Toast.LENGTH_SHORT).show()
//        startActivity(Actions.getLocalidadeIntent(this, localeId))
    }
}