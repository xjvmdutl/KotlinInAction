package ch02

import ch02.Color.*
import java.lang.Exception
import java.time.Year

class When{
    fun getMnemonic(color: Color) =
        when(color){
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }
    /*
    fun getWarmth(color: Color) =
        when(color){
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }
     */
    fun getWarmth(color: Color) =
        when(color){
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

    fun mix(c1:Color, c2: Color) =
        when(setOf(c1, c2)){
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

    fun mixOptimized(c1:Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) || (c2 == RED && c1 == YELLOW) ->
                ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c2 == BLUE && c1 == YELLOW) ->
                GREEN
            (c1 == BLUE && c2 == VIOLET) || (c2 == VIOLET && c1 == BLUE) ->
                INDIGO
            else -> throw Exception("Dirty color")
        }

}

