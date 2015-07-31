package chapter8._2

/**
 * 8.2 메소드 오버라이드하기
 *
 * 아래 상황에서 유용할 수 있음
 *
 * 오버라이드하는 메소드의 이름에 오타가 있을 때
 * 오버라이드하는 메소드에 인자 타입을 실수로 잘못 줬을 때
 * 서브클래스 메소드와 충돌하는 새로운 메소드를 슈퍼클래스에 추가했을 때
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

class Person {
  val name = "Person class"

  override def toString = getClass.getName + "[name=" + name + "]"

  val string = """asdf
asdf
asdf
asdf
asdf
asdf
asdf"""
}

class Employee extends Person {
  val salary = 50.0

  override def toString = super.toString + "[salary=" + salary + "]"
}