package com.example.classapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.classapp.R
import org.w3c.dom.Text

class PokemonDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pokemon_detail, container, false)

        if (arguments != null) {
            //pull pokemon data from the bundle
            val imageUrl = requireArguments().getString("image")
            val name = requireArguments().getString("name")
            val id = requireArguments().getInt("id").toString()
            val generation = requireArguments().getString("generation")
            val type = requireArguments().getInt("type")
            val typeAlt = requireArguments().getInt("typeAlt")
            val ability = requireArguments().getString("ability")
            val category = requireArguments().getString("category")
            val height = requireArguments().getDouble("height").toString()
            val weight = requireArguments().getDouble("weight").toString()
            val pokedexEntry = requireArguments().getString("pokedexEntry")

            //find the fields in the view
            val pokemonImage: ImageView = view.findViewById(R.id.pokemon_image)
            val pokemonName: TextView = view.findViewById(R.id.pokemon_name)
            val pokemonCategory: TextView = view.findViewById(R.id.pokemon_category)
            val pokemonType: ImageView = view.findViewById(R.id.pokemon_type)
            val pokemonTypeAlt: ImageView = view.findViewById(R.id.pokemon_type_alt)
            val pokemonID: TextView = view.findViewById(R.id.pokemon_id)
            val pokemonGeneration: TextView = view.findViewById(R.id.pokemon_generation)
            val pokemonAbility: TextView = view.findViewById(R.id.pokemon_ability)
            val pokemonHeight: TextView = view.findViewById(R.id.pokemon_height)
            val pokemonWeight: TextView = view.findViewById(R.id.pokemon_weight)
            val pokemonPokedexEntry: TextView = view.findViewById(R.id.pokemon_pokedex_entry)

            //bind data to the fields
            Glide
                .with(view.context)
                .load(imageUrl)
                .into(pokemonImage)

            pokemonName.text = name
            pokemonCategory.text = category
            pokemonType.setImageResource(type)

            if (typeAlt != -1) {
                pokemonTypeAlt.setImageResource(typeAlt)
            }

            pokemonID.text = "ID: #$id"
            pokemonGeneration.text = "Generation: $generation"
            pokemonAbility.text = "Ability: $ability"
            pokemonHeight.text = "Height: $height m"
            pokemonWeight.text = "Weight: $weight kg"
            pokemonPokedexEntry.text = pokedexEntry
        }

        return view
    }
}