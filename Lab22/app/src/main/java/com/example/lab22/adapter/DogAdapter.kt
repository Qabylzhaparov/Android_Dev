package com.example.lab22.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab22.databinding.ItemDogBinding
import com.example.lab22.model.DogApi

class DogAdapter(private var dogs: List<DogApi>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class DogViewHolder(private val binding: ItemDogBinding) : RecyclerView.ViewHolder(binding.root) {
        val dogName: TextView = binding.dogName
        val dogImageLink: ImageView = binding.dogImageLink
        val dogShedding: TextView = binding.dogShedding
        val dogGrooming: TextView = binding.dogGrooming
        val dogDrooling: TextView = binding.dogDrooling
        val dogCoatLength: TextView = binding.dogCoatLength
        val dogGoodWithStrangers: TextView = binding.dogGoodWithStrangers
        val dogPlayfulness: TextView = binding.dogPlayfulness
        val dogProductiveness: TextView = binding.dogProtectiveness
        val dogTrainability: TextView = binding.dogTrainability
        val dogEnergy: TextView = binding.dogEnergy
        val dogBarking: TextView = binding.dogBarking

        fun bind(dog: DogApi) {
            dogName.text = dog.name.toString()
            Glide.with(itemView)
                .load(dog.imageLink)
                .into(dogImageLink)
            dogShedding.text = "Shedding: " + "⭐".repeat(dog.shedding)
            dogGrooming.text = "Grooming: " + "⭐".repeat(dog.grooming)
            dogDrooling.text = "Drooling: " + "⭐".repeat(dog.drooling)
            dogCoatLength.text = "Coat Length: " + "⭐".repeat(dog.coatLength)
            dogGoodWithStrangers.text = "Good With Strangers: " + "⭐".repeat(dog.goodWithStrangers)
            dogPlayfulness.text = "Playfulness: " + "⭐".repeat(dog.playfulness)
            dogProductiveness.text = "Protectiveness: " + "⭐".repeat(dog.protectiveness)
            dogTrainability.text = "Trainability: " + "⭐".repeat(dog.trainability)
            dogEnergy.text = "Energy: " + "⭐".repeat(dog.energy)
            dogBarking.text = "Barking: " + "⭐".repeat(dog.barking)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemDogBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val dog = dogs[position]
        if (holder is DogViewHolder) {
            holder.bind(dog)
        }
    }

    override fun getItemCount() = dogs.size

    fun submitList(newDogs: List<DogApi>) {
        val diffResult = DiffUtil.calculateDiff(DogDiffUtil(dogs, newDogs))
        dogs = newDogs
        diffResult.dispatchUpdatesTo(this)
    }

}
