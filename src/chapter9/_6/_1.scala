package chapter9._6

import java.io.PrintWriter

import scala.io.Source

/**
 * 9.6 텍스트 파일 쓰기
 *
 * 스칼라는 내장된 파파일 쓰기 지원이 없으므로 java.io.PrintWriter 사용
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val out = new PrintWriter("/Users/cloudine/Downloads/a3.csv")
  for (i <- 1 to 100) {
    out.println(i)
//    out.printf("%6d %10.2f", i)
  }
  out.close

  val source = Source.fromFile("/Users/cloudine/Downloads/a3.csv", "UTF-8")
  println("source.mkString = " + source.mkString)
  source.close
}
