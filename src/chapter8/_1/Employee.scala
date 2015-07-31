package chapter8._1

/**
 * extends 와 final 키워드는 자바와 마찬가지
 * 메소드를 오버라이드할 때는 override 를 사용해야 함
 * 기본 생성자만이 기본 슈퍼클래스 생성자를 호출 가능함
 * 필드를 오버라이드 가능
 *
 * 8.1 클래스 확장하기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

class Person {

}

class Employee extends Person {
  var salary = 0.0
}
