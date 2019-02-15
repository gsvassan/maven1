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
   * @pram test comment
   * @string test comment
   */
  
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
