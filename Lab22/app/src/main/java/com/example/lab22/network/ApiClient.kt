package com.example.lab22.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val request = chain.request()
            val newRequest = request.newBuilder()
                .addHeader("X-Api-Key", "3RdFOIkc5S8Rk65vfz1JGvfwcO59h8LSQHZkuJM2")
                .build()
            chain.proceed(newRequest)
        }
        .build()

    private const val BASE_URL = "https://api.api-ninjas.com/"

    val instance: DogService by lazy {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(DogService::class.java)
    }
}