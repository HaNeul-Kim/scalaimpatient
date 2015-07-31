import scala.collection.mutable.ArrayBuffer

object Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
}

class Network8 {
  private val members = new ArrayBuffer[Network.Member]
}

// 또는

class Network8_1 {
  class Member8_1(val name: String) {
    val contacts = new ArrayBuffer[Network8_1#Member8_1]
  }
}