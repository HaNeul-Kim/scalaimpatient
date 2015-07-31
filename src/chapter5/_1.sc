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