package chapter9._3

import scala.io.StdIn

/**
 * 콘솔에서 숫자를 읽을 수 있음
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _2 extends App {
  print("How old are you? ")
  val age = StdIn.readInt()
  println("age = " + age)
}
