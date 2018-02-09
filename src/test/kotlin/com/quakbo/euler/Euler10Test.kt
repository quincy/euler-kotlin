package com.quakbo.euler

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Euler10Test {

    @Test
    fun `sum of primes below 10 is 17`() {
        assertThat(Sieve(10).primes().sum(), `is`(17L))
    }
}
