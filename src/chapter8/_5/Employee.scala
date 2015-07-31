package chapter8._5

/**
 * 8.5 슈퍼클래스 생성
 *
 * 스칼라 생성자에서는 super(params) 를 절대 호출하지 않음
 * 기본 생성자는 자바 슈퍼클래스 생성자들 중의 하나를 반드시 호출해야 함
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Person(name: String, age: Int) {
  def this() {
    this("", 0)
  }
}

class Employee(name: String, age: Int, val salary: Double) extends Person(name, age) {
  def this() {
    this("sky", 20, 100.0)
  }
}

/*
public class Employee extends Person {
  private double salary;
  public Employee(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;
  }
}
 */