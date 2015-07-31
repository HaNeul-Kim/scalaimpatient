package chapter6._6

/**
 * 6.6 이뉴머레이션
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object TrafficLightColor extends Enumeration {
  //val Red, Yellow, Green = Value
  val Red = Value(0, "Stop")
  val Yellow = Value(10) // 이름 "Yellow"
  val Green = Value("Go") // ID 11
  // 지정하지 않으면 ID 는 0부터 시작
  // 앞서 할당된 값보다 1 큰 값이 됨
  // 기본 이름은 필드명

  type TrafficLightColor = Value

  def doWhat(color: TrafficLightColor) = {
    if (color == Red) "stop"
    else if (color == Yellow) "hurry up"
    else "go"
  }

  def main(args: Array[String]) {
    for (c <- TrafficLightColor.values) println(c.id + ": " + c)
    println("TrafficLightColor(0) = " + TrafficLightColor(0))
    println("TrafficLightColor.withName(\"Stop\") = " + TrafficLightColor.withName("Stop"))
  }
}
