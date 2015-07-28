// 4.1 맵 생성
// -> 연산자는 쌍을 만든다
// "Alice" -> 10 == ("Alice", 10)
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
// scala.collection.immutable.Map[String,Int]
val mutableScores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val emptyScores = new scala.collection.mutable.HashMap[String,Int]
val tupleMap = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

// 4.2 맵 값 접근
val bobsScore = scores("Bob")
// 자바에서 scores.get("Bob") 과 같음
val bobsScore2 = if (scores.contains("Bob")) scores("Bob") else 0
val bobsScore3 = scores.getOrElse("Bob", 0)

// 4.3 맵 값 갱신
mutableScores("Bob") = 10
mutableScores("Fred") = 7
mutableScores
mutableScores += ("Bob" -> 15, "Fred" -> 12)
mutableScores -= "Alice"

var varScores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val newScores = varScores + ("Bob" -> 10, "Fred" -> 7)
varScores = varScores - "Alice"

// 4.4 맵 반복
scores.keySet
val values = for (v <- scores.values) yield v
val kvTovk = for ((k, v) <- scores) yield (v, k)

// 4.5 정렬 맵
val sortedMap = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7)

// 4.6 자바 연동
import scala.collection.JavaConversions.mapAsScalaMap
val treeMap: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

import scala.collection.JavaConversions.propertiesAsScalaMap
//val props: scala.collection.Map[String, String] = System.getProperties()

import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._
val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
val font = new java.awt.Font(attrs)

// 4.7 튜플
val t = (1, 3.14, "Fred")
// Tuple3[Int, Double, java.lang.String]
//(Int, Double, java.lang.String)
val sec = t._2

//val (first, second, third) = t
val (first, second, _) = t
val partition = "New York".partition(_.isUpper)
// 4.8 Zipping
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
for ((s, n) <- pairs) print(s * n)
