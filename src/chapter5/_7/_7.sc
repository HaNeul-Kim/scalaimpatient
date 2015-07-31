// 5.7 기본 생성자
class Person(val name: String = "", val age: Int = 0) {
  println("Just constructed another person")

  def description = name + " is " + age + " years old"
}

val person7_1 = new Person()
person7_1.description
val person7_2 = new Person("Ha Neul, Kim", 29)
person7_2.description
class Person7_1(val name: String, private var age: Int) {

}
/*
위는
val name: String
private var age: Int
를 선언하고 초기화 함
 */