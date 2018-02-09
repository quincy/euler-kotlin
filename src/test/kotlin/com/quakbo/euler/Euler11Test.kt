package com.quakbo.euler

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Euler11Test {
    private val grid4x4 = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(3, 3, 3, 3),
            intArrayOf(2, 2, 2, 2),
            intArrayOf(4, 4, 4, 5))

    @Test
    fun `can find largest product of four adjacent numbers in 4x4 grid`() {
        val product = Grid(grid4x4).maxProductOf(4)

        assertThat(product, `is`(320))
    }

    @Test
    fun `can find largest product of four adjacent numbers in big grid`() {
        val product = Grid(matrix).maxProductOf(4)

        assertThat(product, `is`(70600674))
    }
}