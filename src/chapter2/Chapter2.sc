println("Hello World!!")
// 2.1 조건식
val x = 5
val s = if (x > 0) "positive" else -1
println("s = " + s)
// 2.5 루프
val hello = "Hello"
var sum = 0
for (i <- 0 until hello.length) {
  sum += hello(i)
}
println("sum = " + sum)

sum = 0
for (ch <- hello) {
  sum += ch
}
println("sum = " + sum)

// 2.6 고급 for
for (i <- 1 to 3; j <- 1 to 3) {
  print((10 * i + j) + " ")
}
println()
for (i <- 1 to 3; j <- 1 to 3 if i != j) {
  print((10 * i + j) + " ")
}
println()
for (i <- 1 to 3; from = 4 - i; j <- from to 3) {
  print((10 * i + j) + " ")
}
println()
val yieldVector = for (i <- 1 to 10) yield i % 3
println("yieldVector = " + yieldVector)
val hello0to1 = for (c <- hello; i <- 0 to 1) yield (c + i).toChar
println("hello0to1 = " + hello0to1)
val zeroToOneHello = for (i <- 0 to 1; c <- hello) yield (c + i).toChar
println("zeroToOneHello = " + zeroToOneHello)
// 2.7 함수
def abs(x: Double) = if (x >= 0) x else -x
/*def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) {
    r = r * i
  }
}*/
def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
// 2.8 기본 인자와 이름 인자
def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

val decHello = decorate(hello)
println("decHello = " + decHello)

val dec2Hello = decorate(hello, "<<<", ">>>")
println("dec2Hello = " + dec2Hello)
val argNameDec = decorate(left = "<<<", str = hello, right = ">>>")
println("argNameDec = " + argNameDec)
// 2.9 가변 인자
def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}
val sum55_1 = sum(1, 4, 9, 16, 25)
println("sum55_1 = " + sum55_1)
val sum15 = sum(1 to 5: _*)
println("sum15 = " + sum15)
def recursiveSum(args: Int*): Int = {
  if (args.length == 0) {
    0
  } else {
    args.head + recursiveSum(args.tail: _*)
  }
}
val sum55_2 = recursiveSum(1, 4, 9, 16, 25)
println("sum55_2 = " + sum55_2)
// 2.10 프로시저
def box(s: String) {
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
}
def box2(s: String): Unit = {
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
}

box(hello)
box2(hello)
// 2.11 레이지값
/*lazy val words2 = io.Source.fromFile("/Users/cloudine/Downloads/test2.csv").mkString
def words3 = io.Source.fromFile("/Users/cloudine/Downloads/test2.csv").mkString
val words1 = io.Source.fromFile("/Users/cloudine/Downloads/test2.csv").mkString*/