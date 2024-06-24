package com.example.okemonz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.okemonz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val PokemonAdapter by lazy { PokemonAdapter() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()


        PokemonAdapter.differ.submitList(Repository.pokemons)



        binding.apply {
            rvCharacters.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = PokemonAdapter
            }

        }



    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val button = findViewById<Button>(R.id.button1)
//        button.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java).apply {
//                putExtra("id", 1)
//            }
//            this.startActivity(intent)
//        }
//
//
//    }

}











