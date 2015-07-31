// outer 가 Network.this 를 지칭함
// self 가 일반적임
class Network(val name: String) { outer =>
  class Member(val name: String) {
    def description = name + " inside " + outer.name
  }
}

val outerTest = new Network("outerTest")
val outerMember = new outerTest.Member("outer Member")
outerMember.description