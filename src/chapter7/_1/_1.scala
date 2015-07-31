package chapter7._1

import chapter7._1.org.bigjava.Counter

/**
 * 패키지는 중첩됨
 * 패스는 절대가 아님
 * 구문에서 x.y.z 체인은 중간 패키지인 x 와 x.y 를 감춤
 * 파일 시작에 나오는 중괄호 없는 패키지문은 전체 파일로 확장됨
 * 패키지 오브젝트는 함수와 변수를 가질 수 있음
 * 임포트문은 패키지, 클래스와 오브젝트를 임포트 가능
 * 임포트문은 아무 데나 올 수 있음
 * 임포트문은 멤버 이름을 바꾸거나 숨길 수 있음
 * java.lang, scala, Predef 는 항상 임포트됨
 *
 * 7.1 패키지
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

package com {
  package horstmann {
    package impatient {
      class Employee
    }
  }
}

package org {
  package bigjava {
    class Counter
  }
}

class _1 {
  import chapter7._1.com.horstmann.impatient.Employee

  val e = new Employee
  val c = new Counter
}
