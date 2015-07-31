/*
싱글톤과 유틸리티 메소드를 위해 오브젝트를 사용
클래스는 같은 이름의 컴패니언 오브젝트를 가질 수 있음
오브젝트는 클래스나 트레이트를 확장 가능
오브젝트의 apply 메소드는 보통 컴패니언 클래스의 새 인스턴스를 생성할 때 사용
main 메소들르 피하기 위해 App 트레이트를 확장하는 오브젝트를 사용
Enumeration 오브젝트를 확장하여 이뉴머레이션을 구현 가능
 */

// 6.1 싱글톤
object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

Accounts.newUniqueNumber()
Accounts.newUniqueNumber()

// 오브젝트 생성자는 오브젝트가 처음 사용될 때 실행
// 생성자 인자를 줄 수 없다
// 자바나 C++ 에서 싱글톤 오브젝트를 사용했다면 스칼라에서는 오브젝트를 사용
// 유틸리티 함수나 상수를 두는 장소
// 하나의 수정 불가능한 인스턴스가 효율적으로 공유될 수 있는 경우
// 어떤 서비스를 조정하기 위해 하나의 인스턴스가 필요한 경우(싱글톤 디자인 패턴)