package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val listener: FragmentMoviesDetailsClicks? get() = (activity as? FragmentMoviesDetailsClicks)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.txtBack).setOnClickListener { listener?.removeLastFragment() }
        view.findViewById<View>(R.id.imgPath).setOnClickListener { listener?.removeLastFragment() }
    }

    interface FragmentMoviesDetailsClicks {
        fun removeLastFragment()
    }

}