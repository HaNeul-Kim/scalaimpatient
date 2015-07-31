package chapter8._6

/**
 * 8.6 필드 오버라이드하기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString= "secret"
}
