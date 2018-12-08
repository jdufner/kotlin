package de.jdufner.learning.kotlin;

import org.junit.Test;

/**
 * Unit test for simple JavaService.
 */
public class JavaServiceTest {

  @Test
  public void java_should_say_hello_world() {
    // arrange

    // act
    JavaService.sayHello();

    // assert
  }

  @Test
  public void kotlin_should_say_hello_world() {
    // arrange

    // act
    KotlinServiceKt.sayHello();

    // assert
  }

}
