package com.quakbo.euler

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import java.math.BigInteger

class Euler8KtTest {

    @Test
    fun `productOf 12345`() {
        val (product, digits) = productOf("12345")
        assertThat(digits, `is`("12345"))
        assertThat(product, `is`(BigInteger.valueOf(120)))
    }

    @Test
    fun `productOf 9781797784617`() {
        val (product, digits) = productOf("9781797784617")
        assertThat(digits, `is`("9781797784617"))
        assertThat(product, `is`(BigInteger.valueOf(2091059712)))
    }
}