package com.gri.androidacademyworkshop.utils

import android.content.Context
import androidx.core.content.ContextCompat
import com.gri.androidacademyworkshop.R

object Utils {
     fun getImage(imageName: String, context: Context): Int {
        return context.resources.getIdentifier(
            imageName,
            "drawable",
            context.packageName
        )
    }

     fun getColor(flag: Int, context: Context): Int {
        val color = if (flag >= 0) R.color.star_on else R.color.star_off
        return ContextCompat.getColor(context, color)
    }

    fun xxx() {}

}