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

private fun isPrime(n: Int, primes: List<Int>): Boolean {
    return primes.none { n % it == 0 }
}

/*
MutableList takes a size for the initial list and an initialization function which it uses to calculate the initial value for each element.  The init function
has type (Int) -> T, where the input parameter specifies the index of the value to be calculated.  I don't care about the indexes, the output will be constant,
so { 2 } will just produce the return value 2 for every input to the function and we can leave off the parameter list entirely.


MutableList creates a List which can be modified.  Compare that to the listOf() function which produces an immutable List.
 */