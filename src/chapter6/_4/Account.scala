package chapter6._4

/**
 * 6.4 apply 메소드
 *
 * apply 메소드는 다음 형태의 식에서 호출됨
 * Object(arg1, ..., argN)
 * 보통 이런 apply 메소드는 컴패니언 클래스의 오브젝트를 리턴함
 *
 * 주의
 * Array(100) 과 new Array(100) 은 다름
 * Array(100) 은 apply(100) 을 호출하여 하나의 원소 정수 100 을 가진 Array[Int] 를 리턴
 * new Array(100) 은 this(100) 을 호출하여 100개의 null 원소를 가진 Array[Nothing]
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Account private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance
}

object Account {
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def apply(initialBalance: Double) = new Account(newUniqueNumber(), initialBalance)

  def main(args: Array[String]) {
    val acct = Account(1000.0)
  }
}