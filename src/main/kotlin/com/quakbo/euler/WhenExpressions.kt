package com.quakbo.euler

interface Vehicle {
    fun upShift()
    fun downShift()
}

data class Car(private val gears: Int = 5) : Vehicle {
    private var currentGear = 1

    override fun upShift() {
        if (currentGear < gears) {
            currentGear++
            println("...$currentGear${getOrdinal(currentGear)}")
        } else {
            println("Can't up shift past $gears${getOrdinal(gears)}")
        }
    }

    override fun downShift() {
        if (currentGear > 1) {
            currentGear--
            println("...$currentGear${getOrdinal(currentGear)}")
        } else {
            println("Can't down shift past 1st")
        }
    }
}

private fun getOrdinal(n: Int): String {
    return when (n) {
        1 -> "st"
        2 -> "nd"
        3 -> "rd"
        else -> "th"
    }
}

fun main(args: Array<String>) {
    val fourSpeed = Car(4)

    for (gear in 1..6) {
        fourSpeed.upShift()
    }

    for (gear in 6 downTo 1) {
        fourSpeed.downShift()
    }
}

/*
Interfaces work pretty much as you'd expect.  There is no implements or extends keywords, though.  Also, multiple inheritance is totally legal in kotlin.

Function parameters can specify default values as seen on line 8.

The getOrdinal function on line 30 is interesting because it uses a when expression.  It's kind of like a switch statement, but it returns a value.  There is no
switch statement in kotlin.
 */
