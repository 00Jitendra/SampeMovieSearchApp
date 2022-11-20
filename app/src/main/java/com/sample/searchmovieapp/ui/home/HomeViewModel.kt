package com.sample.searchmovieapp.ui.home

import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.material.internal.ViewUtils.hideKeyboard
import com.sample.searchmovieapp.data.model.SearchMovies
import com.sample.searchmovieapp.manager.ApiManager
import com.sample.searchmovieapp.util.Connectivity
import com.sample.searchmovieapp.util.extns.hideKeyboard
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _moviesItems =
        MutableLiveData<MutableList<SearchMovies.Search>>().apply {
            value = mutableListOf()
        }
    val moviesItems: LiveData<MutableList<SearchMovies.Search>> = _moviesItems

    private val _noDataFoundVisibility = MutableLiveData<Int>().apply { value = View.GONE }
    val noDataFoundVisibility: LiveData<Int> = _noDataFoundVisibility

    val mUpdatedMovieList = mutableListOf<SearchMovies.Search>()
    /**
     * function to search movies list
     * */
    fun loadMovieList(
        apiKey: String,
        fragmentActivity: HomeFragment,
        movieName: String,
        type: String,
        pageNo: String,
        limit: String
    ) {
        if (Connectivity.isInternetOn()) {
            val service = ApiManager.initRetrofit(fragmentActivity.requireContext())
            viewModelScope.launch {

                val response = service.getMoviesList(
                    apiKey, movieName,type,pageNo, limit
                )
                if (response.isSuccessful) {
                    if (!response.body()!!.search.isNullOrEmpty()) {
                        fragmentActivity.handleVisibility(false)
                        fragmentActivity.handleDataNotFind(false)
                        mUpdatedMovieList.addAll(response.body()!!.search)
                        _moviesItems.value = mUpdatedMovieList
                        fragmentActivity.handleKeyBoardVisibility()
                    } else {
                        fragmentActivity.handleVisibility(false)
                        fragmentActivity.handleDataNotFind(true)
                    }
                }else{
                    fragmentActivity.handleVisibility(false)
                    fragmentActivity.handleDataNotFind(true)
                }
            }
        } else {
            fragmentActivity.requireActivity().runOnUiThread {
                Toast.makeText(fragmentActivity.requireContext(),"No internet connection",Toast.LENGTH_SHORT).show()
            }
        }
    }
}