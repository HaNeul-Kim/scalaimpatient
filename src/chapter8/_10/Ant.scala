package chapter8._10

/**
 * 8.10 생성 순서와 조기 정의
 *
 * 조기정의 문법(with)을 사용하여 서브클래스의 val 필드를 슈퍼클래스가 실행되기 전에 초기화할 수 있게 한다.
 * 문법이 이상해서 잘 사용하지 않음
 * with 는 보통 트레이트와 함께 사용됨
 * -Xcheckinit 컴파일러 플래그로 생성 순서 문제를 디버깅 가능.
 * 이 플래그는 초기화되지 않은 필드에 접근했을 때 기본 값을 주는 대신에 예외를 던지도록 코드를 생성.
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2

  def printAny(x: Any): Unit = {
    println(x)
  }

  def printUnit(x: Unit): Unit = {
    println(x)
  }

  def printUnit(): Unit = {
    println(())
  }

  def printline(): Unit = {
    println()
  }
}

class Bug extends {
  override val range = 3
} with Creature

object Ant {
  def main(args: Array[String]) {
    val ant = new Ant
    println("ant.range = " + ant.range)
    println("ant.env.length = " + ant.env.length) // 길이가 0 이 됨
    // 생성자 바디에서 val 값에 의존하지 않는 게 좋다
    ant.printAny("Hello")
    ant.printUnit("Hello")
    ant.printUnit()
    ant.printline()

    val bug = new Bug
    println("bug.range = " + bug.range)
    println("bug.env.length = " + bug.env.length) // 길이가 3 이 됨
  }
}