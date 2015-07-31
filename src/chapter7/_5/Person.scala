package chapter7._5

/**
 * 7.5 패키지 오브젝트
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
  }
}

class Person {
  val person = new people.Person
}

object App extends App {
  println("(new Person).person = " + (new Person).person)
  println("(new Person).person.name = " + (new Person).person.name)
  println("com.horstmann.impatient.people.defaultName = " + com.horstmann.impatient.people.defaultName)
}
