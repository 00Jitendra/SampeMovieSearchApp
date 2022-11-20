package com.sample.searchmovieapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sample.searchmovieapp.data.model.SearchMovies
import com.sample.searchmovieapp.databinding.ItemMovieBinding


class MovieFragmentAdapter(
    private val viewModel: HomeViewModel,
    val context: HomeFragment
) :
    ListAdapter<SearchMovies.Search, MovieFragmentAdapter.ViewHolder>(
        TaskDiffCallbackReport()
    ) {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(viewModel, getItem(position), context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    class ViewHolder private constructor(val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            viewModel: HomeViewModel,
            item: SearchMovies.Search,
            context: HomeFragment
        ) {

            binding.viewModel = viewModel
            binding.allItem = item
            binding.executePendingBindings()


        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMovieBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(
                    binding
                )
            }
        }
    }
}

    /**
     * Callback for calculating the diff between two non-null items in a list.
     *
     * Used by ListAdapter to calculate the minimum number of changes between and old list and a new
     * list that's been passed to `submitList`.
     */
    class TaskDiffCallbackReport : DiffUtil.ItemCallback<SearchMovies.Search>() {
        override fun areItemsTheSame(
            oldItem: SearchMovies.Search,
            newItem: SearchMovies.Search
        ): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(
            oldItem: SearchMovies.Search,
            newItem: SearchMovies.Search
        ): Boolean {
            return oldItem == newItem
        }
    }