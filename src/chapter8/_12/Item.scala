package chapter8._12

/**
 * 8.12 오브젝트 등식
 *
 * AnyRef.eq() 는 두 레퍼퍼런스가 같은 오브젝트를 가리키는지 확인
 * AnyRef.equals() 는 eq 를 호출
 * 클래스를 구현할 때는 상황에 맞는 자연스러운 개념의 등식을 제공하기 위해 equals 메소드를 오버라이드 하는 것을 고려하는 것이 좋음
 * equals 메소드 인자 타입을 Any 로 해야함
 *
 * final def equals(other: Item) = {...} 은 AnyRef.equals() 를 오버라이드 한것이 아닌 다른 메소드임
 *
 * equals 를 정의할 때는 hashCode 도 같이 정의하는 것이 좋음
 * 해시 코드는 등식 확인에 사용되는 필드로만 계산하는 것이 좋음
 *
 * 보통 eq 나 equals 를 호출하지 않고 간단히 == 연산자를 사용함
 * 레퍼런스 타입일 경우 null 체크 후 equals 로 검사
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
class Item(val description: String, val price: Double) {
  final override def equals(other: Any): Unit = {
    val that = other.asInstanceOf[Item]
    if (that == null) {
      false
    } else {
      description == that.description && price == that.price
    }
  }

  final override def hashCode = 13 * description.hashCode + 17 * price.hashCode()
}
