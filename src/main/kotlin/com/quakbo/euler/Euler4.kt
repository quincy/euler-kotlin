package com.quakbo.euler

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

fun isPalindrome(n: Int): Boolean {
    val s = n.toString()
    return s.reversed() == s
}

fun main(args: Array<String>) {
    done@ for (i in 999 downTo 900) {
        for (j in 999 downTo 900) {
            val product = i * j
            if (isPalindrome(product)) {
                println(product)
                break@done
            }
        }
    }
}