package com.quakbo.euler

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Euler11Test {
    private val grid4x4 = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(1, 2, 3, 4))

    @Test
    fun `can find largest product of four adjacent numbers in 4x4 grid`() {
        val product = Grid(grid4x4).maxProductOf(4)

        assertThat(product, `is`(256))
    }

    @Test
    fun `can find largest product of four adjacent numbers in big grid`() {
        val product = Grid(matrix).maxProductOf(4)

        assertThat(product, `is`(1788696))
    }
}