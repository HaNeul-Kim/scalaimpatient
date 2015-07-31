package chapter8._8

/**
 * 8.8 추상 클래스
 *
 * 스칼라에서는 추상 메메소드에 abstract 키워드를 쓰지 않고 단순히 바디를 생략
 * 서브클래스에서는 추상메소드를 정의할 때 override 키워드 사용할 필요 없음
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
abstract class Person(val name: String) {
  def id: Int
}

class Employee(name: String) extends Person(name) {
  def id = name.hashCode
}
