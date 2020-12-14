package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gri.androidacademyworkshop.adapters.MovieListAdapter
import com.gri.androidacademyworkshop.model.Movie
import com.gri.androidacademyworkshop.utils.ActorsDataSource

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private val listener: FragmentMoviesListClicks ? get() = (activity as? FragmentMoviesListClicks)
    private var recycler: RecyclerView? = null
    private var movies = listOf<Movie>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler = view.findViewById(R.id.rv_movieList)
        recycler?.layoutManager = GridLayoutManager(this.context, 2, GridLayoutManager.VERTICAL, false )
        recycler?.adapter = MovieListAdapter {movie -> listener?.showMoviesDetailsFragment(movie) }
    }

    interface FragmentMoviesListClicks {
        fun showMoviesDetailsFragment(movie: Movie)
    }

    override fun onStart() {
        super.onStart()
        movies = ActorsDataSource().getMovies()
        updateData()
    }

    private fun updateData() {
        (recycler?.adapter as? MovieListAdapter)?.bindMovies(movies)
    }
}