package com.example.classapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.classapp.ui.PokemonDetailFragment

class PokemonAdapter(private val pokemonList: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pokemon_card_view, parent, false)
        return PokemonViewHolder(view) { position ->
            val pokemon = pokemonList[position]

            val bundle = bundleOf(
                "image" to pokemon.imageUrl,
                "name" to pokemon.name,
                "id" to pokemon.id,
                "generation" to pokemon.generation,
                "type" to pokemon.type,
                "typeAlt" to pokemon.typeAlt,
                "ability" to pokemon.ability,
                "category" to pokemon.category,
                "height" to pokemon.height,
                "weight" to pokemon.weight,
                "pokedexEntry" to pokemon.pokedexEntry
            )

            val detailFragment = PokemonDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount(): Int = pokemonList.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemonItem = pokemonList[position]
        val name = pokemonItem.name
        val id = pokemonItem.id.toString()
        val generation = pokemonItem.generation
        //holder.pokemonImage.setImageResource(pokemonItem.image)
        Glide
            .with(holder.itemView.context)
            .load(pokemonItem.imageUrl)
            .into(holder.pokemonImage)
        holder.pokemonName.text = "Name: $name"
        holder.pokemonId.text = "ID: $id"
        holder.pokemonGeneration.text = "Generation: $generation"
        holder.pokemonType.setImageResource(pokemonItem.type)
        //alt_type is set to -1 if pokemon does not have a 2nd type
        if (pokemonItem.typeAlt != -1) {
            holder.pokemonTypeAlt.setImageResource(pokemonItem.typeAlt)
        }
    }

    inner class PokemonViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemon_image)
        val pokemonName: TextView = itemView.findViewById(R.id.pokemon_name)
        val pokemonId: TextView = itemView.findViewById(R.id.pokemon_id)
        val pokemonGeneration: TextView = itemView.findViewById(R.id.pokemon_generation)
        val pokemonType: ImageView = itemView.findViewById(R.id.pokemon_type)
        val pokemonTypeAlt: ImageView = itemView.findViewById(R.id.pokemon_type_alt)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}