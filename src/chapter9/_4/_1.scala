package chapter9._4

import scala.io.Source

/**
 * 9.4 URL 과 다른 소스에서 읽기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val source1 = Source.fromURL("http://samplecsvs.s3.amazonaws.com/Sacramentorealestatetransactions.csv", "UTF-8")
  val source2 = Source.fromString("Hello, World!")
  val source3 = Source.stdin// cmd + d 로 입력을 종료할 수 있음

  println("source1.mkString = " + source1.mkString)
  println("source2.mkString = " + source2.mkString)
  println("source3.mkString = " + source3.mkString)

  source3.close
  source2.close
  source1.close
}
