package com.dti.guildamobile.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dti.guildamobile.databinding.ItemDogHomeBinding

class ItemDogAdapter(private val dogsList: List<Dog>,
                     private val itemClick: (Dog) -> Unit)
: RecyclerView.Adapter<ItemDogAdapter.DogItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogItemViewHolder {
        val itemBinding =
            ItemDogHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = DogItemViewHolder(itemBinding)

        itemBinding.root.setOnClickListener {
            itemClick(dogsList[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int = dogsList.size

    override fun onBindViewHolder(holder: DogItemViewHolder, position: Int) {
        val dog = dogsList[position]
        with(holder.itemView) {
            Glide.with(this.context)
                .load(dog.url)
                .into(holder.binding.imageView)
            holder.binding.textView2.text = "Dog " + dog.url
        }

    }

    class DogItemViewHolder(itemBinding: ItemDogHomeBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {
        val binding = itemBinding
    }
}