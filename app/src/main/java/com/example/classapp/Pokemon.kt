package com.example.classapp

data class Pokemon(
    val image: Int,
    val name: String,
    val id: Int,
    val generation: String,
    val type: Int,
    //set to -1 if a 2nd type is not needed
    val alt_type: Int
)
