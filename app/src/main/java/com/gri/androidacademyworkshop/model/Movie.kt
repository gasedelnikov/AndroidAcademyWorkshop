package com.gri.androidacademyworkshop.model

data class Movie(
    val title: String,
    val description: String,
    val like: Boolean,
    val rating: Int,
    val ageAdmission: Int,
    val reviewsCont: Int,
    val timing: Int,
    val genre: String,
    val posterRef: String,
    val maskRef: String,
    var actors: List<Actor>
)