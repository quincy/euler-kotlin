package com.quakbo.euler

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

According to Wikipedia, every Pythagorean triplet is expressed by

    a = m^2 - n^2, b = 2mn, c = m^2 + n^2

    where m > n > 0
    and m and n are coprime
    and m and n are both not odd

So a brute force approach is to increment m and n one at a time and find a, b, and c.
*/

fun main(args: Array<String>) {

    val sum = 1000L

    for (m in 2L..99L) {
        for (n in 1L until m) {
            val (a, b, c) = createPythagoreanTriplet(m, n) ?: continue

            if ((a + b + c) == sum) {
                println("Found ($a, $b, $c) with sum=${a + b + c} and product = ${a * b * c})")
                return
            }
        }
    }

    println("No pythagorean triplets found which sum to 1000.")
}

fun createPythagoreanTriplet(m: Long, n: Long): Triple<Long, Long, Long>? {
    if (m <= n || m < 1) {
        return null
    }

    if (isOdd(m) && isOdd(n)) {
        return null
    }

    if (coprime(m, n)) {
        return null
    }

    val a: Long = (m * m) - (n * n)
    val b: Long = 2 * m * n
    val c: Long = (m * m) + (n * n)

    return Triple(a, b, c)
}

fun isOdd(i: Long): Boolean {
    return i % 2L != 0L
}

/** Return true if the greatest common divisor of m and n is 1. */
fun coprime(m: Long, n: Long): Boolean {
    var gcd = 1
    var i = 1

    while (i <= m && i <= n) {
        if (m % i == 0L && n % i == 0L) {
            gcd = i
        }
        i++
    }

    return gcd == 1
}
