package com.quakbo.euler

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

internal fun isPalindrome(n: Int): Boolean {
    val s = n.toString()
    return s.reversed() == s
}

fun main(args: Array<String>) {
    done@ for (i in 999 downTo 900) {
        for (j in 999 downTo 900) {
            val product = i * j
            if (isPalindrome(product)) {
                println(product)
                break@done
            }
        }
    }
}

/*
Earlier was saw the range operator which creates a Sequence.

    1..999

We can also create a sequence of decreasing values with the downTo operator.

In Kotlin we write a foreach loop as

    for (v in someRangeOfValues)

The in operator can be used in the following ways

 - specifies the object being iterated in a for loop
 - is used as an infix operator to check that a value belongs to a range, a collection or another entity that defines the 'contains' method
 - is used in when expressions for the same purpose

done@ is a label to help with flow control.  When we say break@done, we're saying break out of the loop labeled with done@.
Without the label we would have broken out of the loop at line 16 and begun another iteration of the outer for loop.

There are implicit labels for loop constructs.  So you can do things like this...

    while (foo < 100) {
        for (i in 1..foo) {
            if (foo == 2) { continue@while }
        }
    }
 */
