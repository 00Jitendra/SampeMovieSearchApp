package com.sample.searchmovieapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sample.searchmovieapp.R
import com.sample.searchmovieapp.databinding.FragmentHomeBinding
import com.sample.searchmovieapp.util.extns.hideKeyboard
import com.sample.searchmovieapp.util.recyclerHelper.SpacesItemDecoration
import com.sample.searchmovieapp.util.recyclerHelper.SpacingItemDecoration

class HomeFragment : Fragment() {


    val viewModel: HomeViewModel by viewModels()
    private lateinit var viewDataBinding: FragmentHomeBinding
    private lateinit var movieAdapter: MovieFragmentAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        viewDataBinding = FragmentHomeBinding.bind(view).apply {
            searchMovieViewModel = viewModel
        }
        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner
        // setHasOptionsMenu(true)
        setupListAdapter()

        viewDataBinding.swipeRefresh.setOnRefreshListener {
            refreshList()
        }


        viewDataBinding.clearSearchTextBtn.setOnClickListener {
            if (viewDataBinding.etSearchMovie.text.toString()!= null) {
                viewDataBinding.etSearchMovie.text=null
                hideKeyboard()
            }
        }

        viewDataBinding.goBtn.setOnClickListener {
            viewModel.loadMovieList(
                "b9bd48a6", this,
                viewDataBinding.etSearchMovie.text.toString(), "movie", "1", "30"
            )
            viewDataBinding.clearSearchTextBtn.visibility=View.VISIBLE
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }

    private fun setupListAdapter() {
        val viewModel = viewDataBinding.searchMovieViewModel
        if (viewModel != null) {
            movieAdapter =
                MovieFragmentAdapter(
                    viewModel, this
                )
            viewDataBinding.movieList.addItemDecoration(
                SpacingItemDecoration(
                    2,5,true
                )
            )
            viewDataBinding.movieList.adapter = movieAdapter
        } else {
            //  Log.d("ViewModel not initialized when attempting to set up adapter.")
        }
    }

    fun handleVisibility(value: Boolean) {
        if (value) {
            viewDataBinding.progressContainer.visibility = View.VISIBLE
        } else {
            viewDataBinding.progressContainer.visibility = View.GONE
        }
    }

    fun handleKeyBoardVisibility() {
        hideKeyboard()
        viewDataBinding.swipeRefresh.isRefreshing = false
    }

    fun handleDataNotFind(value: Boolean) {
        if (value) {
            viewDataBinding.noDataFound.visibility = View.VISIBLE
        } else {
            viewDataBinding.noDataFound.visibility = View.GONE
        }
    }

    private fun refreshList() {
        movieAdapter.submitList(emptyList())
        viewDataBinding.swipeRefresh.isRefreshing = true
        viewModel.loadMovieList(
            "b9bd48a6", this,
            viewDataBinding.etSearchMovie.text.toString(), "movie", "1", "30"
        )
    }
}