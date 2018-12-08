package de.jdufner.learning.kotlin

/**
 * @author Jürgen Dufner
 * @since 1.0
 */
fun fib(i: Int): Int {
    if (i <= 2) {
        return 1
    }
    return fib(i - 1) + fib(i - 2)
}
