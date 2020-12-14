package com.gri.androidacademyworkshop.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gri.androidacademyworkshop.R
import com.gri.androidacademyworkshop.model.Actor

class ActorsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val avatar: ImageView? = itemView.findViewById(R.id.imgCast)
    private val name: TextView? = itemView.findViewById(R.id.txtCast)
    private val RecyclerView.ViewHolder.context get() = this.itemView.context

    fun onBind(actor: Actor) {
        Glide.with(context)
            .load(getImage(actor.avatar))
            .into(avatar)

        name?.text = actor.name
    }

    private fun getImage(imageName: String?): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}