package com.gri.androidacademyworkshop.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gri.androidacademyworkshop.R
import com.gri.androidacademyworkshop.model.Actor
import com.gri.androidacademyworkshop.viewHolders.ActorsViewHolder

class ActorsAdapter : RecyclerView.Adapter<ActorsViewHolder>() {
    private var actors = listOf<Actor>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        return ActorsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_holder_actor,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ActorsViewHolder, position: Int) {
         holder.onBind(actors[position])
    }

    override fun getItemCount(): Int = actors.size

    fun bindActors(newActors: List<Actor>) {
        actors = newActors
    }
}






