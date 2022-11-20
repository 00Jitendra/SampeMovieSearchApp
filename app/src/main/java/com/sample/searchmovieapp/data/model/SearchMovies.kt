package com.sample.searchmovieapp.data.model


import com.google.gson.annotations.SerializedName

data class SearchMovies(
    @SerializedName("Response")
    val response: String, // True
    @SerializedName("Search")
    val search: MutableList<Search>,
    @SerializedName("totalResults")
    val totalResults: String // 184
) {
    data class Search(
        @SerializedName("imdbID")
        val imdbID: String, // tt4154664
        @SerializedName("Poster")
        val poster: String, // https://m.media-amazon.com/images/M/MV5BMTE0YWFmOTMtYTU2ZS00ZTIxLWE3OTEtYTNiYzBkZjViZThiXkEyXkFqcGdeQXVyODMzMzQ4OTI@._V1_SX300.jpg
        @SerializedName("Title")
        val title: String, // Captain Marvel
        @SerializedName("Type")
        val type: String, // movie
        @SerializedName("Year")
        val year: String // 2019
    )
}