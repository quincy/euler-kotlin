package com.quakbo.euler

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

fun isDivisibleByTheFirst20Numbers(n: Int): Boolean {
    return (1..20).all { n % it == 0 }
}

fun main(args: Array<String>) {
    val n = generateSequence(20, { i -> i + 20 })
            .takeWhile { !isDivisibleByTheFirst20Numbers(it) }
            .max() ?: throw IllegalStateException("No value found")

    println(n + 1)
}