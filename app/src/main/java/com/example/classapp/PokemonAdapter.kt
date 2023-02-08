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
        val name = pokemon_item.name
        val id = pokemon_item.id.toString()
        val generation = pokemon_item.generation
        holder.pokemonImage.setImageResource(pokemon_item.image)
        holder.pokemonName.text = "Name: $name"
        holder.pokemonId.text = "ID: $id"
        holder.pokemonGeneration.text = "Generation: $generation"
        holder.pokemonType.setImageResource(pokemon_item.type)
        //alt_type is set to -1 if pokemon does not have a 2nd type
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