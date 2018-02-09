package com.quakbo.euler

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

fun main(args: Array<String>) {
    println((1..999)
            .filter { it % 3 == 0 || it % 5 == 0 }
            .sum())
}

/*
Functions can be declared at the package level with no class associated with it.
    (1..999)                        Generates a Range containing the values [1, 999]

    .filter                         Produces a List containing only the values satisfying the given predicate

    { it % 3 == 0 || it % 5 == 0 }  A lambda expression.  Lambdas take the form { input -> expression }
                                    You can omit the input parameter and refer to the input with the special variable `it`

    .sum()                          Sum all of the values in the List and return the result

    println()                       Just like System.out.println() but far more powerful...
 */
