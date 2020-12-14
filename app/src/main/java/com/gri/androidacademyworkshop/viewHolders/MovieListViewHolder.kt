package com.gri.androidacademyworkshop.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gri.androidacademyworkshop.R
import com.gri.androidacademyworkshop.model.Movie
import com.gri.androidacademyworkshop.utils.Utils

class MovieListViewHolder(itemView: View, private val listener: (Movie) -> Unit) :
    RecyclerView.ViewHolder(itemView) {
    private val listenerView: View = itemView.findViewById(R.id.movieInList)
    private val imgMovie: ImageView = itemView.findViewById(R.id.imageMovie)
    private val like: ImageView = itemView.findViewById(R.id.imgLike)

    private val title: TextView = itemView.findViewById(R.id.txtMovieTitle)
    private val ageAdmission: TextView = itemView.findViewById(R.id.txtAgeAdmission)
    private val reviewsCont: TextView = itemView.findViewById(R.id.txtReviews)
    private val genre: TextView = itemView.findViewById(R.id.txtMovieType)
    private val timing: TextView = itemView.findViewById(R.id.txtTiming)

    private val imgStar1: ImageView = itemView.findViewById(R.id.imgStar1)
    private val imgStar2: ImageView = itemView.findViewById(R.id.imgStar2)
    private val imgStar3: ImageView = itemView.findViewById(R.id.imgStar3)
    private val imgStar4: ImageView = itemView.findViewById(R.id.imgStar4)
    private val imgStar5: ImageView = itemView.findViewById(R.id.imgStar5)

    fun onBind(movie: Movie) {
        Glide.with(itemView.context).load(Utils.getImage(movie.posterRef, itemView.context)).into(imgMovie)

        title.text = movie.title
        ageAdmission.text = itemView.context.getString(R.string.age_admission, movie.ageAdmission.toString())
        reviewsCont.text = itemView.context.getString(R.string.reviews, movie.reviewsCont.toString())
        genre.text = movie.genre
        timing.text = itemView.context.getString(R.string.timing, movie.timing.toString())

        listenerView.setOnClickListener { listener(movie) }

        val likeColor = if (movie.like) R.color.like_on else R.color.like_off
        like.setColorFilter(ContextCompat.getColor(itemView.context, likeColor))

        imgStar1.setColorFilter(Utils.getColor(movie.rating - 1, itemView.context))
        imgStar2.setColorFilter(Utils.getColor(movie.rating - 2, itemView.context))
        imgStar3.setColorFilter(Utils.getColor(movie.rating - 3, itemView.context))
        imgStar4.setColorFilter(Utils.getColor(movie.rating - 4, itemView.context))
        imgStar5.setColorFilter(Utils.getColor(movie.rating - 5, itemView.context))
    }

}