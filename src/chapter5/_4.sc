// 5.4 오브젝트-비공개 필드
class Counter {
  private[this] var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current = value

  // private[this] 때문에 불가능
  //def isLess(other: Counter) = value < other.value
}