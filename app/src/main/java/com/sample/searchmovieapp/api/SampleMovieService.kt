package com.sample.searchmovieapp.api

import com.google.gson.JsonObject
import com.sample.searchmovieapp.data.model.SearchMovies
import retrofit2.Response
import retrofit2.http.*


interface SampleMovieService {


    @GET(ApiSetting.SEARCH_MOVIES)
    suspend fun  getMoviesList(
        @Query(ApiSetting.API_KEY) apiKey: String,
        @Query(ApiSetting.MOVIES_NAME) moviesName: String,
        @Query(ApiSetting.TYPE) type: String,
        @Query(ApiSetting.PAGE_NO) no: String,
        @Query(ApiSetting.LIMIT) limit: String
    ): Response<SearchMovies>
}