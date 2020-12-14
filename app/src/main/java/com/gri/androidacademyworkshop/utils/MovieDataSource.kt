package com.gri.androidacademyworkshop.utils

import com.gri.androidacademyworkshop.model.Actor
import com.gri.androidacademyworkshop.model.Movie

class ActorsDataSource {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                "Avengers: End Game",
                "description1",
                true,
                0,
                1,
                1,
                121,
                "Action, Adventure, Fantasy0",
                "poster_avengers",
                "mask_avengers",
                listOf(
                    Actor("Alicia Vikander", "cast4"),
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("Alicia Vikander", "cast1"),
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("Anne Hathaway", "cast4"),
                    Actor("Emma Stone", "cast3"),
                    Actor("Keira Knightley", "cast1"),
                    Actor("George Clooney", "cast2")
                )
            ),
            Movie(
                "Black Widow",
                "description2",
                false,
                1,
                13,
                3,
                12,
                "Action, Adventure, Fantasy1",
                "poster_black_widow",
                "mask_avengers",
                listOf(
                    Actor("Alicia Vikander", "cast1"),
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("Anne Hathaway", "cast4"),
                    Actor("Emma Stone", "cast3"),
                    Actor("Keira Knightley", "cast1"),
                    Actor("George Clooney", "cast2")
                )
            ),
            Movie(
                "Tenet",
                "description3",
                false,
                2,
                20,
                66,
                320,
                "Action, Adventure, Fantasy2",
                "poster_tenet",
                "mask_avengers",
                listOf(
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("Anne Hathaway", "cast4"),
                    Actor("Emma Stone", "cast3"),
                    Actor("Keira Knightley", "cast1"),
                    Actor("George Clooney", "cast2")
                )
            ),
            Movie(
                "Wonder Woman 1984",
                "description4",
                true,
                3,
                93,
                44,
                520,
                "Action, Adventure, Fantasy3",
                "poster_wonder_woman",
                "mask_avengers",
                listOf(
                    Actor("Alicia Vikander", "cast1"),
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("Anne Hathaway", "cast4"),
                    Actor("Emma Stone", "cast3"),
                )
            ),
            Movie(
                "x4",
                "description5",
                false,
                4,
                91,
                19933,
                120,
                "Action, Adventure, Fantasy4",
                "poster_tenet",
                "mask_avengers",
                listOf(
                    Actor("Alicia Vikander", "cast1"),
                    Actor("Amanda Seyfried", "cast2"),
                    Actor("George Clooney", "cast2")
                )
            ),
            Movie(
                "x5",
                "description6",
                true,
                5,
                97,
                1353,
                160,
                "Action, Adventure, Fantasy5",
                "poster_avengers",
                "mask_avengers",
                listOf(
                    Actor("Alicia Vikander", "cast1"),
                    Actor("Amanda Seyfried", "cast2"),
                )
            )
        )
    }
}