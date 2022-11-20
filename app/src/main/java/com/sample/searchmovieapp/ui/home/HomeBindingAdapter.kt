package com.sample.searchmovieapp.ui.home

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.searchmovieapp.data.model.SearchMovies

@BindingAdapter("app:items")
fun setMovieList(listView: RecyclerView, items: MutableList<SearchMovies.Search>) {
    (listView.adapter as MovieFragmentAdapter).swapData(items)
}
