package com.example.lab22.model

import com.google.gson.annotations.SerializedName

data class DogApi(
    val name: String,
    @SerializedName("image_link") val imageLink: String,
    val shedding: Int,
    val grooming: Int,
    val drooling: Int,
    @SerializedName("coat_length") val coatLength: Int,
    @SerializedName("good_with_strangers") val goodWithStrangers: Int,
    val playfulness: Int,
    val protectiveness: Int,
    val trainability: Int,
    val energy: Int,
    val barking: Int
)


