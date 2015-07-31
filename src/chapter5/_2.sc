// 5.2 게터와 세터가 있는 프로퍼티
/*class Person {
  var age = 0
}

val fred = new Person
fred.age
fred.age = 21*/
// fred.age_=(21)

class Person {
  private var privateAge = 0

  def age = privateAge

  def age_=(newValue: Int): Unit = {
    if (newValue > privateAge) {
      privateAge = newValue
    }
  }
}

val fred = new Person
fred.age = 30
fred.age = 21
fred.age