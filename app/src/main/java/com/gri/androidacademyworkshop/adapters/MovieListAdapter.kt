package com.gri.androidacademyworkshop.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gri.androidacademyworkshop.FragmentMoviesList
import com.gri.androidacademyworkshop.R
import com.gri.androidacademyworkshop.model.Movie
import com.gri.androidacademyworkshop.viewHolders.MovieListViewHolder

class MovieListAdapter(private val listener: (Movie) -> Unit) : RecyclerView.Adapter<MovieListViewHolder>() {
    private var movies = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        return MovieListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_holder_movie,
                parent,
                false
            ),
            listener
        )
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
         holder.onBind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    fun bindMovies(newMovies: List<Movie>) {
        movies = newMovies
    }
}






