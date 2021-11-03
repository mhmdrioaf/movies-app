package com.ananta.movies.movies.data

data class MovieEntity(
    var movieId: String,
    var title: String,
    var description: String,
    var imagePath: String,
    var director: String,
    var productionCompany: String,
    var budget: String,
    var genre: String,
    var year: String,
    var url: String,
)