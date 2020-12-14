package com.gri.androidacademyworkshop

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gri.androidacademyworkshop.adapters.ActorsAdapter
import com.gri.androidacademyworkshop.model.Movie
import com.gri.androidacademyworkshop.utils.Utils

class FragmentMoviesDetails(val movie: Movie) : Fragment(R.layout.fragment_movies_details) {
    private val listener: FragmentMoviesDetailsClicks? get() = (activity as? FragmentMoviesDetailsClicks)
    private var recycler: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtMovieTitle).text = movie.title
        view.findViewById<TextView>(R.id.txtAgeAdmission).text = view.context.getString(R.string.age_admission, movie.ageAdmission.toString())
        view.findViewById<TextView>(R.id.txtMovieType).text = movie.genre
        view.findViewById<TextView>(R.id.txtReviews).text = view.context.getString(R.string.reviews, movie.reviewsCont.toString())
        view.findViewById<TextView>(R.id.txtMovieDesc).text = movie.description

        val imgMovie: ImageView = view.findViewById(R.id.imgMoviePoster)
        Glide.with(view.context).load(Utils.getImage(movie.maskRef, view.context)).into(imgMovie)

        view.findViewById<ImageView>(R.id.imgStar1).setColorFilter(Utils.getColor(movie.rating - 1, view.context))
        view.findViewById<ImageView>(R.id.imgStar2).setColorFilter(Utils.getColor(movie.rating - 2, view.context))
        view.findViewById<ImageView>(R.id.imgStar3).setColorFilter(Utils.getColor(movie.rating - 3, view.context))
        view.findViewById<ImageView>(R.id.imgStar4).setColorFilter(Utils.getColor(movie.rating - 4, view.context))
        view.findViewById<ImageView>(R.id.imgStar5).setColorFilter(Utils.getColor(movie.rating - 5, view.context))

        view.findViewById<View>(R.id.txtBack).setOnClickListener { listener?.removeLastFragment() }
        view.findViewById<View>(R.id.imgPath).setOnClickListener { listener?.removeLastFragment() }

        recycler = view.findViewById(R.id.rv_actors)
        recycler?.layoutManager = LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false )
        recycler?.adapter = ActorsAdapter()
    }

    interface FragmentMoviesDetailsClicks {
        fun removeLastFragment()
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        (recycler?.adapter as? ActorsAdapter)?.bindActors(movie.actors)
    }
}