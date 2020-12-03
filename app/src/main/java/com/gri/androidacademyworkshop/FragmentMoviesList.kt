package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private val listener: FragmentMoviesListClicks ? get() = (activity as? FragmentMoviesListClicks)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.movieInList)
            .setOnClickListener { listener?.showMoviesDetailsFragment() }

    }

    interface FragmentMoviesListClicks {
        fun showMoviesDetailsFragment()
    }

}