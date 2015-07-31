package chapter6._2

/**
 * 6.2 컴패니언 오브젝트
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def getBalance = balance
}

object Account {
  private var lastNumber = 0
  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def main(args: Array[String]) {
    val account = new Account
    account.deposit(50)
    println("account.getBalance = " + account.getBalance)
  }
}

