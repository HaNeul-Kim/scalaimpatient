package chapter7._9

import java.awt.{Color, Font}
import java.util.{HashMap => JavaHashMap, _}
//import java.util.{HashMap => _, _}
import scala.collection.mutable._

/**
 * 7.9 멤버 이름 변경 및 숨기기
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class _1 {
  val color = new Color(0x66, 0x99, 0xcc)
  val font = new Font(Font.SANS_SERIF, Font.BOLD, 5)
  val javaHashMap = new JavaHashMap[String, String]
  val map = new HashMap[String, String]
}
