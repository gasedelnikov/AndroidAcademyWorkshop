package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {
    private var viewMovieInList: View? = null
    private var listener: FragmentMoviesListClicks? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMovieInList = view.findViewById<View>(R.id.movieInList).apply {
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