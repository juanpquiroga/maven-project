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
   */
  public final String greet(final String someone) {
    System.out.println("Hola");
    return String.format("Hello, %s!", someone);
  }
}
