package com.quakbo.euler

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

fun main(args: Array<String>) {

    val primes = MutableList(1, { 2 })
    var candidate = 3

    while (primes.size < 10_001) {
        if (isPrime(candidate, primes)) {
            primes.add(candidate)
        }
        candidate++
    }

    println(primes.last())
}

fun isPrime(n: Int, primes: List<Int>): Boolean {
    return primes.none { n % it == 0 }
}