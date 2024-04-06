package com.example.lab22

import android.app.UiModeManager
import android.content.Context
import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab22.adapter.DogAdapter
import com.example.lab22.databinding.ActivityMainBinding
import com.example.lab22.model.DogApi
import com.example.lab22.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DogAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.BLACK
        val uiModeManager = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
        uiModeManager.nightMode = UiModeManager.MODE_NIGHT_NO

        val recyclerView = binding.recyclerViewFigure
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = DogAdapter(emptyList())
        recyclerView.adapter = adapter
        val message = binding.message

        val api = ApiClient.instance

        binding.searchButton.setOnClickListener {
            message.isVisible = false
            val searchQuery = binding.searchText.text.toString()
            val call = api.getDogs(searchQuery)
            call.enqueue(object : Callback<List<DogApi>> {
                override fun onResponse(call: Call<List<DogApi>>, response: Response<List<DogApi>>) {
                    if (response.isSuccessful) {
                        val dogs = response.body()
                        if (dogs != null && dogs.isNotEmpty()) {
                            println("HTTP ${response.body()}")
                            adapter.submitList(dogs) // Обновить список собак в адаптере
                        } else {
                            adapter.submitList(emptyList()) // Очистить RecyclerView
                            message.isVisible = true
                            message.text = "No such dog"
                        }
                    } else {
                        println("HTTP Failed to get dogs: ${response.code()}")
                    }
                }

                override fun onFailure(call: Call<List<DogApi>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "HTTP FAIL: ${t.message}", Toast.LENGTH_LONG).show()
                    println("HTTPO Failed to get dogs: ${t.message}")
                }
            })
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}

