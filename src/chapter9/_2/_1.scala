package chapter9._2

import scala.io.Source

/**
 * 9.2 문자열 읽기
 *
 * 문자를 소모하지 않고 단순히 확인만 하려면 source 오브젝트의 buffered 메소드를 호출
 * head 메소드를 이용하여 다음 문자를 소모하지 않고 확인 가능
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val source = Source.fromFile("/Users/cloudine/Downloads/a2.csv", "UTF-8")
  /*var iter = source.buffered
  while (iter.hasNext) {
    val head = iter.head
    val next = iter.next
    println("head = " + head)
    println("next = " + next)
  }*/
  val contents = source.mkString
  println("contents = " + contents)
  source.close
}
