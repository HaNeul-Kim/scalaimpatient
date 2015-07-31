package chapter6._3

/**
 * 6.3 클래스나 트레이트를 확장하는 오브젝트
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}

object DoNothingAction extends UndoableAction("Do Nothing") {
  override def undo() {}
  override def redo() {}

  def main(args: Array[String]) {
    val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction/*, ...*/)
  }
}
