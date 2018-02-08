package com.quakbo.euler

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

fun main(args: Array<String>) {
    var num = 600851475143L

    var i = 2L
    while (num > 1) {
        while (num % i == 0L) {
            num /= i
        }
        i++
    }

    println(i - 1)
}