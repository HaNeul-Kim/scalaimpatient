// 5.1 간단한 클래스와 인자 없는 메소드
class Counter {
  private var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current = value
}

val myCounter = new Counter
myCounter.increment()
myCounter.current
// 오브젝트 상태를 변경하는(mutator) 메소드는 ()를 사용
// 오브젝트 상태를 변경하지 않는(accessor) 메소드는 ()를 생략

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

// 5.3 게터만 있는 프로퍼티
class Message {
  val timeStamp = new java.util.Date
}
/*
프로퍼티 구현 방법 4가지

1. var foo: 게터와 세터를 생성
2. val foo: 게터를 생성
3. foo() 와 foo_=() 를 직접 정의
4. foo() 를 직접 정의

쓰기 전용(세터만 있고 게터는 없는) 프로퍼티는 불가능
 */

// 5.4 오브젝트-비공개 필드
/*
class Counter4 {
  private[this] var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current = value

  // private[this] 때문에 불가능
  def isLess(other: Counter4) = value < other.value
}*/

// 5.5 빈 프로퍼티
import scala.beans.BeanProperty

class Person5 {
  @BeanProperty var name: String = _
}
/*
Person5 는 4개의 메소드를 생

1. name: String
2. name_=(newValue: String): Unit
3. getName(): String
4. setName(newValue: String): Unit
 */
