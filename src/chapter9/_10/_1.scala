package chapter9._10

/**
 * 9.10 정규표현식
 *
 * scala.util.matching.Regex 를 이용
 * Regex 오브젝트를 만들려면 String.r 사용
 * \ 나 인용부호가 포함돼있으면 """...""" 사용하는것이 좋음
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val string = "99 bottles, 98 bottles"
  println("string = " + string)

  val numPattern = "[0-9]+".r
  val wsnumwsPattern = """\s+[0-9]+\s+""".r

  for (matchString <- numPattern.findAllIn(string)) {
    println("matchString = " + matchString)
  }

  val matches = numPattern.findAllIn(string).toArray.mkString(",")
  println("matches = " + matches)

  val m1 = wsnumwsPattern.findFirstIn(string)
  println("m1 = " + m1)

  val prefNum = numPattern.findPrefixOf(string)
  println("prefNum = " + prefNum)

  val prefWSNum = wsnumwsPattern.findPrefixOf(string)
  println("prefWSNum = " + prefWSNum)

  val replace_first = numPattern.replaceFirstIn(string, "XX")
  println("replace_first = " + replace_first)

  val replace_all = numPattern.replaceAllIn(string, "XX")
  println("replace_all = " + replace_all)
}