package chapter9._8

import java.io._

/**
 * 9.8 직렬화
 *
 * 자바에서 오브젝트들을 다른 가상 머신으로 전송하거나 단기 저장을 위해 직렬화를 사용함
 * 기본 ID 도 상관 없으면 @SerialVersionUID 어노테이션 생략 가능
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
@SerialVersionUID(42L)
class Person extends Serializable {

}

/*
public class Person implements java.io.Serializable {
  private static final long serialVersionUID = 42L;
}
 */

object Person extends App {
  val fred = new Person
  println("fred = " + fred)
  val out = new ObjectOutputStream(new FileOutputStream("/Users/cloudine/Downloads/serialTest.obj"))
  out.writeObject(fred)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("/Users/cloudine/Downloads/serialTest.obj"))
  val savedFred = in.readObject().asInstanceOf[Person]
  println("savedFred = " + savedFred)
}