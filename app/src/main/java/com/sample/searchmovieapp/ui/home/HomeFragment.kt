package com.sample.searchmovieapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sample.searchmovieapp.R
import com.sample.searchmovieapp.databinding.FragmentHomeBinding
import com.sample.searchmovieapp.util.recyclerHelper.SpacesItemDecoration

class HomeFragment : Fragment() {


    val viewModel: HomeViewModel by viewModels()
    private lateinit var viewDataBinding: FragmentHomeBinding
    private lateinit var reportAdapter: MovieFragmentAdapter


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
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }

    private fun setupListAdapter() {
        val viewModel = viewDataBinding.searchMovieViewModel
        if (viewModel != null) {
            reportAdapter =
                MovieFragmentAdapter(
                    viewModel, this
                )
            viewDataBinding.movieList.addItemDecoration(
                SpacesItemDecoration(
                    2
                )
            )
            viewDataBinding.movieList.adapter = reportAdapter
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

    fun handleDataNotFind(value: Boolean) {
        if (value) {
            viewDataBinding.noDataFound.visibility = View.VISIBLE
        } else {
            viewDataBinding.noDataFound.visibility = View.GONE
        }
    }
}