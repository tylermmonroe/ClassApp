package com.example.classapp

data class Pokemon(
    //main information to be shown on card view
    val imageUrl: String,
    val name: String,
    val id: Int,
    val generation: String,
    val type: Int,
    //set to -1 if a 2nd type is not needed
    val typeAlt: Int,

    //additional information for detail view
    val ability: String,
    val category: String,
    val height: Double,
    val weight: Double,
    val pokedexEntry: String,

)
