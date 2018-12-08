package de.jdufner.learning.kotlin

import org.junit.Test

/**
 * @author Jürgen Dufner
 * @since 1.0
 */
internal class KotlinServiceTest {

  @Test
  fun `kotlin should say hello world`() {
    // arrange

    // act
    sayHello()

    // assert
  }

  @Test
  fun `java should say hello world`() {
    // arrange

    // act
    JavaService.sayHello()

    // assert
  }

}
