package com.quakbo.euler

import com.quakbo.euler.Category.COMPOSITE
import com.quakbo.euler.Category.PRIME

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

private const val limit = 2_000_000

enum class Category {
    PRIME,
    COMPOSITE
}

data class Sieve(private val limit: Int) {
    private val sieve = Array(limit, { index -> if (index < 2) COMPOSITE else PRIME })

    fun primes(): List<Long> {
        val primes = MutableList(0, { 0L })

        for (index in 0 until sieve.size) {
            val candidate = sieve[index]
            if (candidate == COMPOSITE) {
                continue
            }

            primes.add(index.toLong())

            for (multiple in (index + index) until sieve.size step index) {
                sieve[multiple] = COMPOSITE
            }
        }

        return primes
    }
}

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    val sum = Sieve(limit).primes().sum()
    val stop = System.currentTimeMillis()

    println("Sum of primes below $limit = $sum")
    println("Took ${stop - start} ms.")
}

/*
We're using a data class again.  And I didn't fully describe what happens when you define a class as data.  Here's the details.

    data class User(val name: String, val age: Int)

The compiler automatically derives the following members from all properties declared in the primary constructor:

 - equals()/hashCode() pair;
 - toString() of the form "User(name=John, age=42)";
 - componentN() functions corresponding to the properties in their order of declaration;
 - copy() function (see below).

To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:

 - The primary constructor needs to have at least one parameter;
 - All primary constructor parameters need to be marked as val or var;
 - Data classes cannot be abstract, open, sealed or inner;
 - (before 1.1) Data classes may only implement interfaces.


It's often the case that we need to copy an object altering some of its properties, but keeping the rest unchanged. This is what the copy() function is
generated for. For the User class above, its implementation would be as follows:

    fun copy(name: String = this.name, age: Int = this.age) = User(name, age)

This allows us to write:

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
*/
