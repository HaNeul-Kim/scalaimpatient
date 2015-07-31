package chapter7._6

/**
 * 7.6 패키지 가시성
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

package com.horstmann.impatient
package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName

    private [people] def description = "" + name

    private [impatient] def description2 = "" + name
  }
}

