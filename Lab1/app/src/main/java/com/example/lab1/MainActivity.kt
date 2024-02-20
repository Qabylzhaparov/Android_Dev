package com.example.lab1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.example.lab1.adapter.pizzaAdapter
import com.example.lab1.databinding.ActivityMainBinding
import com.example.lab1.model.Pizza
import com.example.lab1.model.PizzaDataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.BLACK // Устанавливаем черный цвет для полосы состояния

        val adapter = pizzaAdapter()
        binding.recyclerViewPizza.adapter = adapter
        adapter.setData(PizzaDataSource.pizzalist)

        adapter.setOnItemClickListener { selectedPizza ->
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("selected_pizza", selectedPizza)
            startActivity(intent)
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (query != null) {
                    val filteredList = PizzaDataSource.pizzalist.filter { pizza ->
                        pizza.name.contains(query, ignoreCase = true) ||
                                pizza.description.contains(query, ignoreCase = true)
                    }
                    adapter.setData(filteredList as ArrayList<Pizza>)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    val filteredList = PizzaDataSource.pizzalist.filter { pizza ->
                        pizza.name.contains(newText, ignoreCase = true) ||
                                pizza.description.contains(newText, ignoreCase = true)
                    }
                    adapter.setData(filteredList as ArrayList<Pizza>)
                }
                return true
            }
        })



    }
}