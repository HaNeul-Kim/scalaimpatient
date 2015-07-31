package chapter8._3

/**
 * 8.3 타입 검사와 캐스트
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

class Person {
  val name = "Person class"

  override def toString = getClass.getName + "[name=" + name + "]"

  val string = """asdf
asdf
asdf
asdf
asdf
asdf
asdf"""
}

class Employee extends Person {
  val salary = 50.0

  override def toString = super.toString + "[salary=" + salary + "]"
}

class _1 {

}

object _1 extends App {
  val p = new Employee
  if (p.isInstanceOf[Employee]) {
    val s = p.asInstanceOf[Employee]
    println("s = " + s)
  }
  println("p = " + p)

  if (p.getClass == classOf[Employee]) {// scala.Predef.classOf
    println("p is Employee class.")
  }
  /*
  ------------------------------------------------------------
  스칼라                 | 자바
  ------------------------------------------------------------
  obj.isInstanceOf[Cl] | obj instanceof Cl
  ------------------------------------------------------------
  obj.asInstanceOf[Cl] | (Cl) obj
  ------------------------------------------------------------
  classOf[Cl]          | Cl.class
  ------------------------------------------------------------
   */
  val s = p match {
    case s: Employee => p.asInstanceOf[Employee]
    case _ => Nil
  }
}