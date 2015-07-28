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

import _root_.scala.beans.BeanProperty
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

필드를 위해 생성되는 메소드

--------------------------------------------------------------------------------------------------
|스칼라 필드                       | 생성된 메소드            | 언제 사용|
--------------------------------------------------------------------------------------------------
val/var name                    | public name           | 공개적으로 접근 가능하고
                                | name_= (var 만)       | 필드가 있는 프로퍼티 구현 시
--------------------------------------------------------------------------------------------------
@BeanProperty val/var name      | public name           | 자바빈과 상호 호환 시
                                | getName()             |
                                | name_= (var 만)       |
                                | setName(...) (var 만) |
--------------------------------------------------------------------------------------------------
private val/var name            | private name         | 자바와 마찬가지로 필드를 이 클래스의
                                | name_= (var 만)       | 메소드에만 한정할 때
                                |                      | 반드시 공개 프로퍼티가 필요한 경우가 아니면
                                |                      | private 을 사용하기 바란다.
--------------------------------------------------------------------------------------------------
private[this] val/var /name     | none                 | 필드를 같은 오브젝트에 호출하는 메소드에만 한정할 때
                                |                      | 일반적으로 잘 쓰이지 않음.
--------------------------------------------------------------------------------------------------
private[ClassName] val/var name | 구현 의존적
--------------------------------------------------------------------------------------------------
 */

// 5.6 보조 생성자
class Person6 {
  private var name = ""
  private var age = 0

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}

// 5.7 기본 생성자
class Person7(val name: String = "", val age: Int = 0) {
  println("Just constructed another person")

  def description = name + " is " + age + " years old"
}

val person7_1 = new Person7()
person7_1.description

val person7_2 = new Person7("Ha Neul, Kim", 29)
person7_2.description

class Person7_1(val name: String, private var age: Int) {

}
/*
위는
val name: String
private var age: Int
를 선언하고 초기화 함
 */

class Person7_2(name: String = "", age: Int) {
  // val 이나 var 없는 인자가 메소드에서 쓰이면 필드가 된다
  // private[this] val 과 같다
  def description = name + " is " + age + " years old"
}
val person7_2_1 = new Person7_2(age = 5)
person7_2_1.description

/*
기본 생성자 인자를 위해 생성되는 필드와 메소드

--------------------------------------------------------------------------------------------
기본 생성자 인자                       | 생성된 필드/메소드
--------------------------------------------------------------------------------------------
name: String                       | 오브젝트-비공개 필드 혹은 메소드가 name 을 사용하지 않으면 필드 없음.
--------------------------------------------------------------------------------------------
private val/var name: String       | 비공개 필드, 비공개 게터/세터
--------------------------------------------------------------------------------------------
val/var name: String               | 비공개 필드, 공개 게터/세터
--------------------------------------------------------------------------------------------
@BeanProperty val/var name: String | 비공개 필드, 공개 스칼라와 자바빈 게터/세터
--------------------------------------------------------------------------------------------
 */








