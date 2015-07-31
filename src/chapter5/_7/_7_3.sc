class Person private(val id: Int) {
  def this() {
    this(5)
  }

  def Id = id
}

// Person7_3 오브젝트를 생성하기 위해 반드시 보조 생성자를 사용해야 함

new Person().Id