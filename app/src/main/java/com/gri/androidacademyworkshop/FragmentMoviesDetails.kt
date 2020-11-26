package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentMoviesDetails : Fragment() {
    private var txtBack: View? = null
    private var imgBack: View? = null
    private var listener: FragmentMoviesDetailsClicks? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtBack = view.findViewById<View>(R.id.txtBack).apply {
            setOnClickListener { listener?.removeLastFragment() }
        }
        imgBack = view.findViewById<View>(R.id.imgPath).apply {
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