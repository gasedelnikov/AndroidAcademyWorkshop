package com.gri.androidacademyworkshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentMoviesDetails.FragmentMoviesDetailsClicks
,FragmentMoviesList.FragmentMoviesListClicks{

    private val fragmentMoviesDetails =
        FragmentMoviesDetails().apply { setClickListener(this@MainActivity) }

    private val fragmentMoviesList =
        FragmentMoviesList().apply { setClickListener(this@MainActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .apply {
                    add(R.id.main_container, fragmentMoviesList)
                    commit()
                }
        }
    }

    override fun showMoviesDetailsFragment(){
        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.main_container, fragmentMoviesDetails)
                addToBackStack(null)
                commit()
            }
    }

    override fun removeLastFragment() {
        if (supportFragmentManager.fragments.size > 1) {
            val lastFragment = supportFragmentManager.fragments.last()
            supportFragmentManager.beginTransaction()
                    .apply {
                        remove(lastFragment)
                        commit()
                    }
        }
    }

    companion object {
        private const val TAG = "WS01Step02ActivityB"
        private const val LOG_PREFIX = "WS01ST02"
    }

}