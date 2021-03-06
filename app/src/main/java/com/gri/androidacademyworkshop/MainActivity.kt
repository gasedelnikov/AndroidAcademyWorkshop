package com.gri.androidacademyworkshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentMoviesDetails.FragmentMoviesDetailsClicks,
    FragmentMoviesList.FragmentMoviesListClicks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentMoviesList = FragmentMoviesList()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, fragmentMoviesList)
                .commit()
        }
    }

    override fun showMoviesDetailsFragment() {
        val fragmentMoviesDetails = FragmentMoviesDetails()
        
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, fragmentMoviesDetails)
            .addToBackStack(null)
            .commit()
    }

    override fun removeLastFragment() {
        if (supportFragmentManager.fragments.size > 1) {
            supportFragmentManager.popBackStack()
        }
    }

}