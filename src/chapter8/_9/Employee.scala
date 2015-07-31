package chapter8._9

/**
 * 8.9 추상 필드
 *
 * 추상필드란 초기값이 없는 필드
 * 메소드와 마찬가지로 추상필드 정의시 override 키워드 필요없음
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
abstract class Person {
  val id: Int // 추기화가 없음 - 이는 추상 게터 메소드가 있는 추상 필드 (val 이니 게터만 있음)
  var name: String // 추상 게터와 세터 메소드가 있는 또 다른 추상 필드 (var 이니 게터 세터 있음)
}

class Employee(val id: Int) extends Person {
  var name = ""
}

object Employee {
  def main(args: Array[String]) {
    val fred = new Person {
      val id = 1729
      var name = "Fred"
    }
  }
}