package com.quakbo.euler

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

According to Wikipedia, every Pythagorean triplet is expressed by

    a = m^2 - n^2, b = 2mn, c = m^2 + n^2

So a brute force approach is to increment m and n one at a time and find a, b, and c.
 */

fun createPythagoreanTriplet(m: Int, n: Int): Triple<Int, Int, Int>? {
    val a = m * m - n * n
    val b = 2 * m * n
    val c = m * m + n * n

    if (a > 0 && b > 0 && c > 0 && a < b && b < c) return Triple(a, b, c)

    return null
}

fun main(args: Array<String>) {

    val sum = 1000

    for (a in 0..499) {
        for (b in 0..499) {
            val triple = createPythagoreanTriplet(a, b) ?: continue

            println("Testing ($a, $b, $c) with sum=${a + b + c} and product = ${a * b * c})")
            if ((a + b + c) == sum) {
//                println("Product of $triplet = ${triplet.product()} and sum = ${triplet.sum()}")
                return
            }
        }
    }

    println("No pythagorean triplets found which sum to 1000.")
}
