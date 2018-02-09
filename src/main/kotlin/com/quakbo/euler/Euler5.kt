package com.quakbo.euler

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

private fun isDivisibleByTheFirst20Numbers(n: Int): Boolean {
    return (1..20).all { n % it == 0 }
}

fun main(args: Array<String>) {
    val n = generateSequence(20, { i -> i + 20 })
            .takeWhile { !isDivisibleByTheFirst20Numbers(it) }
            .max() ?: throw IllegalStateException("No value found")

    println(n + 1)
}

/*
The takeWhile function might not produce any values if the Sequence has no values which satisfy the Predicate.  That means that the max() function has return
type Int?, which is an Int that can have the value null.

I don't want a null value because then I'd have to check for that before doing the addition on line 18.  So I use the 'elvis' operator, ?:

    val l: Int = if (b != null) b.length else -1

Along with the complete if-expression, this can be expressed with the Elvis operator, written ?:

    val l = b?.length ?: -1
 */