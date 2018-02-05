package com.quakbo.euler

/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

fun sumOfSquares(sequence: Sequence<Int>): Int {
    return sequence
            .map { it * it }
            .sum()
}

fun squareOfSums(sequence: Sequence<Int>): Int {
    val sum = sequence.sum()
    return sum * sum
}

fun main(args: Array<String>) {
    val firstHundred = generateSequence(1, {i -> i + 1} ).take(100)
    println(squareOfSums(firstHundred) - sumOfSquares(firstHundred))
}
