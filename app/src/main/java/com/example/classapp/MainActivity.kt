package com.example.classapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.pokemon_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val pokemon_list = createPokemon()

        val adapter = PokemonAdapter(pokemon_list)
        recyclerView.adapter = adapter
    }

    private fun createPokemon(): MutableList<Pokemon> {
        val pokemon_list = mutableListOf<Pokemon>()

        pokemon_list.add(Pokemon(R.drawable.bulbasaur, "Bulbasaur", 1, "I", R.drawable.grass_ic, R.drawable.poison_ic))
        pokemon_list.add(Pokemon(R.drawable.ivysaur, "Ivysaur", 2, "I", R.drawable.grass_ic, R.drawable.poison_ic))
        pokemon_list.add(Pokemon(R.drawable.venusaur, "Venosaur", 3, "I", R.drawable.grass_ic, R.drawable.poison_ic))
        pokemon_list.add(Pokemon(R.drawable.charmander, "Charmander", 4, "I",  R.drawable.fire_ic, -1))
        pokemon_list.add(Pokemon(R.drawable.charmeleon, "Charmeleon", 5, "I",  R.drawable.fire_ic, -1))
        pokemon_list.add(Pokemon(R.drawable.charizard, "Charizard", 6, "I",  R.drawable.fire_ic,  R.drawable.flying_ic))
        pokemon_list.add(Pokemon(R.drawable.squirtle, "Squirtle", 7, "I",  R.drawable.water_ic, -1))
        pokemon_list.add(Pokemon(R.drawable.wartortle, "Wartortle", 8, "I",  R.drawable.water_ic, -1))
        pokemon_list.add(Pokemon(R.drawable.blastoise, "Blastoise", 9, "I",  R.drawable.water_ic, -1))

        return pokemon_list
    }
}