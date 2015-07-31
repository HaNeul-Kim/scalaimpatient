package chapter7._8

/**
 * 7.8 스코프는 어디든 올 수 있다.
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Manager {
  import scala.collection.mutable._
  import chapter7._2.com.horstmann.impatient.Employee

  val subordinates = new ArrayBuffer[Employee]
}
