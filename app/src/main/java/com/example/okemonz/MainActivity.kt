package com.example.diffutilrecylerview

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
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        PokemonAdapter.differ.submitList(loadData())

        binding.apply {
            rvCharacters.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=PokemonAdapter
            }
        }
    }

    fun loadData() : MutableList<SampleModel>{
        val nameList : MutableList<SampleModel> = mutableListOf()
        nameList.add(SampleModel(1, "Sample name"))
        nameList.add(SampleModel(2, "Sample name"))
        nameList.add(SampleModel(3, "Sample name"))
        nameList.add(SampleModel(4, "Sample name"))
        nameList.add(SampleModel(5, "Sample name"))
        nameList.add(SampleModel(6, "Sample name"))
        nameList.add(SampleModel(7, "Sample name"))



        return nameList
    }

}