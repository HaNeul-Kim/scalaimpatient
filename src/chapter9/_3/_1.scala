package chapter9._3

import scala.io.Source

/**
 * 9.3 토큰과 숫자 읽기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val source = Source.fromFile("/Users/cloudine/Downloads/a2.csv", "UTF-8")
  val tokens = source.mkString.split("\\s+")
  for (line <- tokens) {
    val columns = line.split(",")
    for (i <- 0 until columns.length) {
      if (i == columns.length - 1) {
        println("columns(" + i + ") toInt = " + (columns(i) toInt))
      }
    }
  }

  tokens.map(_.split(",").foreach(print))
  source close
}
