package com.example.classapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter(private val pokemon_list: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pokemon_card_view, parent, false)
        return PokemonViewHolder(view)
    }

    override fun getItemCount(): Int = pokemon_list.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon_item = pokemon_list[position]
        holder.pokemonImage.setImageResource(pokemon_item.image)
        holder.pokemonName.text = "Name: " + pokemon_item.name
        holder.pokemonId.text = "ID: " + pokemon_item.id.toString()
        holder.pokemonGeneration.text = "Generation: " + pokemon_item.generation
        holder.pokemonType.setImageResource(pokemon_item.type)
        if (pokemon_item.alt_type != -1) {
            holder.pokemonTypeAlt.setImageResource(pokemon_item.alt_type)
        }
    }

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemon_image)
        val pokemonName: TextView = itemView.findViewById(R.id.pokemon_name)
        val pokemonId: TextView = itemView.findViewById(R.id.pokemon_id)
        val pokemonGeneration: TextView = itemView.findViewById(R.id.pokemon_generation)
        val pokemonType: ImageView = itemView.findViewById(R.id.pokemon_type)
        val pokemonTypeAlt: ImageView = itemView.findViewById(R.id.pokemon_type_alt)
    }
}