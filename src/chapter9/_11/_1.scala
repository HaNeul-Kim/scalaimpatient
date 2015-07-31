package chapter9._11

import scala.util.matching.Regex

/**
 * 9.11 정규표현식 그룹
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val numitemPattern = "([0-9]+) ([a-z]+)".r
  val numitemPattern(num, item) = "99 bottles"// num = 99, item = bottles
  println("num = " + num)
  println("item = " + item)
  
  for (numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles")) {
    println("num = " + num)
    println("item = " + item)
  }
}
