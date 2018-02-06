package com.quakbo.euler

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Euler9KtTest {

    @Test
    fun `valid triple satisfy requirements`() {
        val (a, b, c) = createPythagoreanTriplet(4, 2) ?: throw IllegalStateException()
        assertThat(a * a + b * b, `is`(c * c))
    }

    @Test
    fun `invalid triple is null`() {
        val triple = createPythagoreanTriplet(2, 4)
        assertThat(triple, `is`(nullValue()))
    }
}