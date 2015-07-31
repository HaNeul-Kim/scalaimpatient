package chapter9._1

import scala.io.Source

/**
 * 9 파일과 정규표현식
 *
 * Source.fromFile(...).getLines.toArray 는 파일의 모든 줄을 줌
 * Source.fromFile(...).mkString 은 파일 내용을 문자열로 줌
 * 문자열을 숫자로 변환하려면 toInt 나 toDouble 사용
 * 텍스트 파일을 쓰려면 자바 PrintWriter 를 사용
 * "regex".r 은 Regex 오브젝트
 * 정규표현식에 \ 나 " 가 포함되어 있다면 """...""" 을 사용
 * 정규표현식 패턴에 그룹이 있으면 for (regex(var1, ..., varn) <- string) 문법으로 내용 추출 가능
 *
 * 9.1 줄 읽기기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class _1 {

}

object _1 extends App {
  val source = Source.fromFile("/Users/cloudine/Downloads/a2.csv", "UTF-8")
  /*val lineIterator = source.getLines
  for (l <- lineIterator) println("l = " + l)*/
  /*val lines = source.getLines.toArray
  for (line <- lines) {
    println("line = " + line)
  }*/
  val contents = source.mkString
  println("contents = " + contents)
  source.close()
}