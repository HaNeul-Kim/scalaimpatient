package chapter8._7

/**
 * 8.7 익명 서브클래스
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
abstract class Person {
  val name = ""
  def id: Int
}

class Student(override val id: Int) extends Person {

}

object Student {
  var alien = new Person {
    override def id: Int = 5
    def greeting = "Greetings, Earthling! My name is Fred."
  }

  def meet(p: Person{def greeting: String}): Unit = {
    println(p.name + " says: " + p.greeting)
  }
}