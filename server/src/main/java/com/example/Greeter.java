package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Give a greeter message
   * @param someone the name of the person
   * @return greeting string
   */
  public final String greet(final String someone) {
    System.out.println("Hola");
    return String.format("Hello, %s!", someone);
  }
}
