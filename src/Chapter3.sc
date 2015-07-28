import scala.collection.mutable.ArrayBuffer

// 3.1 고정 길이 배열
var numArray = new Array[Int](10)
val a = new Array[String](10)
val s = Array("Hello", "World")
s(0) = "Goodbye"

// 3.2 가변 길이 배열: 배열 버퍼
val b = ArrayBuffer[Int]()
b += 1
b +=(1, 2, 3, 5)
b ++= Array(8, 13, 21)
b.trimEnd(5) // 마지막 5개 원소를 제거

b.insert(2, 6)
b.insert(2, 7, 8, 9)
//  b.remove(2)
//  b.remove(2, 3)
b
val bToArray = b.toArray
val sToBuffer = s.toBuffer
// 3.3 배열과 배열 버퍼 방문
val untilLength = 0 until s.length
val until2 = 0 until(b.length, 2)
val untilReverse = (0 until s.length).reverse
// 3.4 배열 변환
val array = Array(2, 3, 5, 7, 11)
val arrayResult = for (el <- array) yield 2 * el
val evenArrayDouble = for (el <- array if el % 2 == 0) yield 2 * el
val evenArrayDouble2 = array.filter(_ % 2 == 0).map(2 * _)
val evenArrayDouble3 = array filter {_ % 2 == 0 } map {2 * _}
val arrayBuffer = array.toBuffer
/*
var first = true
var n = arrayBuffer.length
var i = 0
while (i < n) {
  if (arrayBuffer(i) >= 0) {
    i += 1
  } else {
    if (first) {
      first = false
      i += 1
    } else {
      arrayBuffer.remove(i)
      n -= 1
    }
  }
}
*/

// 위보다 아래가 더 좋다
val array2 = ArrayBuffer(-3, -2, -1, 0, 1, 2, 3)
var first = true
val indexes = for (i <- 0 until array2.length if first || array2(i) >= 0) yield {
  if (array2(i) < 0) {
    first = false
  }
  i
}

for (j <- 0 until indexes.length) {
  array2(j) = array2(indexes(j))
}
array2.trimEnd(array2.length - indexes.length)
// 3.5 일반 알고리즘
var array35 = Array(1, 7, 2, 9)
val arraySum = array35.sum
val arrayBufferMax = ArrayBuffer("Marry", "had", "a", "little", "lamb").max
scala.util.Sorting.quickSort(array35)
val array35mkString = array35.mkString(" and ")
val array35mkString2 = array35.mkString("<", ",", ">")
// 3.7 다차원 배열
val matrix = Array.ofDim[Double](3, 4)
matrix(2)(3) = 42
// 3.8 자바 연동
import scala.collection.JavaConversions.bufferAsJavaList
val command = ArrayBuffer("ls", "-alF", "/Users/cloudine/Downloads")
val pb = new ProcessBuilder(command)
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer
val cmd: Buffer[String] = pb.command()