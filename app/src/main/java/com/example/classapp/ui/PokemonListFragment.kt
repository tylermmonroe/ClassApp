package com.example.classapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.classapp.Pokemon
import com.example.classapp.PokemonAdapter
import com.example.classapp.R

class PokemonListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pokemon_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.pokemon_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val pokemon_list = createPokemon()

        val adapter = PokemonAdapter(pokemon_list)
        recyclerView.adapter = adapter

        return view
    }

    private fun createPokemon(): MutableList<Pokemon> {
        val pokemon_list = mutableListOf<Pokemon>()

        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/f/fb/0001Bulbasaur.png/250px-0001Bulbasaur.png",
                "Bulbasaur",
                1,
                "I",
                R.drawable.grass_ic,
                R.drawable.poison_ic,
                "Overgrow",
                "Seed Pokemon",
                0.7,
                6.9,
                "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon."
            )
        )

        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/8/81/0002Ivysaur.png/250px-0002Ivysaur.png",
                "Ivysaur",
                2,
                "I",
                R.drawable.grass_ic,
                R.drawable.poison_ic,
                "Overgrow",
                "Seed Pokemon",
                1.0,
                13.0,
                "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/6/6b/0003Venusaur.png/250px-0003Venusaur.png",
                "Venosaur",
                3,
                "I",
                R.drawable.grass_ic,
                R.drawable.poison_ic,
                "Overgrow",
                "Seed Pokemon",
                2.0,
                100.0,
                "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/2/27/0004Charmander.png/250px-0004Charmander.png",
                "Charmander",
                4,
                "I",
                R.drawable.fire_ic,
                -1,
                "Blaze",
                "Lizard Pokemon",
                0.6,
                8.5,
                "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/0/05/0005Charmeleon.png/250px-0005Charmeleon.png",
                "Charmeleon",
                5,
                "I",
                R.drawable.fire_ic,
                -1,
                "Blaze",
                "Flame Pokemon",
                1.1,
                19.0,
                "When it swings its burning tail, it elevates the temperatures to unbearably high levels."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/3/38/0006Charizard.png/250px-0006Charizard.png",
                "Charizard",
                6,
                "I",
                R.drawable.fire_ic,
                R.drawable.flying_ic,
                "Blaze",
                "Flame Pokemon",
                1.7,
                90.5,
                "Spits fire hot enough to melt boulders. Known to cause forest fires unintentionally."

            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/5/54/0007Squirtle.png/250px-0007Squirtle.png",
                "Squirtle",
                7,
                "I",
                R.drawable.water_ic,
                -1,
                "Torrent",
                "Tiny Turtle Pokemon",
                0.5,
                9.0,
                "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/0/0f/0008Wartortle.png/250px-0008Wartortle.png",
                "Wartortle",
                8,
                "I",
                R.drawable.water_ic,
                -1,
                "Torrent",
                "Turtle Pokemon",
                1.0,
                22.5,
                "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance."
            )
        )
        pokemon_list.add(
            Pokemon(
                "https://archives.bulbagarden.net/media/upload/thumb/0/0a/0009Blastoise.png/250px-0009Blastoise.png",
                "Blastoise",
                9,
                "I",
                R.drawable.water_ic,
                -1,
                "Torrent",
                "Shellfish Pokemon",
                1.6,
                85.5,
                "A brutal Pokemon with pressurized water jets on its shell. They are used for high speed tackles."
            )
        )

        return pokemon_list
    }
}