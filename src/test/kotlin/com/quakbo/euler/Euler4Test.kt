package com.quakbo.euler

import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Test

class Euler4Test {

    @Test
    fun `isPalindrome passes palindromes`() {
        assertThat(isPalindrome(906609), CoreMatchers.`is`(true))
    }

    @Test
    fun `isPalindrome fails non-palindromes`() {
        assertThat(isPalindrome(123456), CoreMatchers.`is`(false))
    }
}