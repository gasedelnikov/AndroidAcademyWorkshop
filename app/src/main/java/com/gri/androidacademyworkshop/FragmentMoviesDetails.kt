package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private var listener: FragmentMoviesDetailsClicks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.txtBack).apply {
            setOnClickListener { listener?.removeLastFragment() }
        }
        view.findViewById<View>(R.id.imgPath).apply {
            setOnClickListener { listener?.removeLastFragment() }
        }
    }

    fun setClickListener(l: FragmentMoviesDetailsClicks?) {
        listener = l
    }

    interface FragmentMoviesDetailsClicks {
        fun removeLastFragment()
    }

}