package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private var listener: FragmentMoviesListClicks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.movieInList).apply {
            setOnClickListener { listener?.showMoviesDetailsFragment() }
        }
    }

    fun setClickListener(l: FragmentMoviesListClicks?) {
        listener = l
    }

    interface FragmentMoviesListClicks {
        fun showMoviesDetailsFragment()
    }

}