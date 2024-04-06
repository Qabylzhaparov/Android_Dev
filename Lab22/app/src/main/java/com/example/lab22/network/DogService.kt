package com.example.lab22.network

import com.example.lab22.model.DogApi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DogService {
    @GET("v1/dogs")
    fun getDogs(@Query("name") name: String): Call<List<DogApi>>
}