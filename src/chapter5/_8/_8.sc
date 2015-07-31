// 5.8 중첩 클래스

import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new Network
val myFace = new Network
val chatterMember = new chatter.Member("chatter")

val fred8 = chatter.join("Fred8")
val wilma = chatter.join("Wilma")
fred8.contacts += wilma
val barney = myFace.join("Barney")
// fred8.contacts += barney
// 불가능. myFace.Member 를 chatter.Member 버퍼의 원소에 더할 수 없음.