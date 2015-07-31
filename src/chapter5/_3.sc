// 5.3 게터만 있는 프로퍼티
class Message {
  val timeStamp = new java.util.Date
}
/*
프로퍼티 구현 방법 4가지

1. var foo: 게터와 세터를 생성
2. val foo: 게터를 생성
3. foo() 와 foo_=() 를 직접 정의
4. foo() 를 직접 정의

쓰기 전용(세터만 있고 게터는 없는) 프로퍼티는 불가능
 */