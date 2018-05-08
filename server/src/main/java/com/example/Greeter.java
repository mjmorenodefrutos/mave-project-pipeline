/**
* Paquete de prueba
@author mjm
@version 1.0
*/
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
* @param someone cadena
* @return cadena
*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
