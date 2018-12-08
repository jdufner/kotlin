package de.jdufner.learning.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * @author Jürgen Dufner
 * @since 1.0
 */
internal class FibonacciTest {

    @Test
    fun `fib(1) = 1`() {
        // arrange

        // act
        val fib = fib(1)

        // assert
        assertEquals(1, fib)
    }

    @Test
    fun `fib(2) = 1`() {
        // arrange

        // act
        val fib = fib(2)

        // assert
        assertEquals(1, fib)
    }

    @Test
    fun `fib(3) = 2`() {
        // arrange

        // act
        val fib = fib(3)

        // assert
        assertEquals(2, fib)
    }

    @Test
    fun `fib(4) = 3`() {
        // arrange

        // act
        val fib = fib(4)

        // assert
        assertEquals(3, fib)
    }

    @Test
    fun `fib(5) = 5`() {
        // arrange

        // act
        val fib = fib(5)

        // assert
        assertEquals(5, fib)
    }

    @Test
    fun `fib(6) = 8`() {
        // arrange

        // act
        val fib = fib(6)

        // assert
        assertEquals(8, fib)
    }

    @Test
    fun `fib(7) = 13`() {
        // arrange

        // act
        val fib = fib(7)

        // assert
        assertEquals(13, fib)
    }

    @Test
    fun `fib(8) = 21`() {
        // arrange

        // act
        val fib = fib(8)

        // assert
        assertEquals(21, fib)
    }

    @Test
    fun `fib(9) = 34`() {
        // arrange

        // act
        val fib = fib(9)

        // assert
        assertEquals(34, fib)
    }

    @Test
    fun `fib(10) = 55`() {
        // arrange

        // act
        val fib = fib(10)

        // assert
        assertEquals(55, fib)
    }

    @Test
    fun `fib(11) = 89`() {
        // arrange

        // act
        val fib = fib(11)

        // assert
        assertEquals(89, fib)
    }

    @Test
    fun `fib(12) = 144`() {
        // arrange

        // act
        val fib = fib(12)

        // assert
        assertEquals(144, fib)
    }

    @Test
    fun `fib(13) = 233`() {
        // arrange

        // act
        val fib = fib(13)

        // assert
        assertEquals(233, fib)
    }

}