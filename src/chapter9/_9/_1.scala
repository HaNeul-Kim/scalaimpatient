package chapter9._9

import java.io.File

import sys.process._

/**
 * 9.9 프로세스 제어
 *
 * scala.sys.process 패키지 이용하여 스칼라로 쉘 스크립트를 작성 가능
 * scala.sys.process 패키지는 문자열에서 ProcessBuilder 오브젝트로 암묵적으로 변환을 포함하고 있음.
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  // ! 연산자는 ProcessBuilder 오브젝트 실행
  // ! 연산자 결과는 실행된 프로그램의 종료 코드: 성공시 0 성공 아니면 0 아닌 실패 지시자
  "ls -alF /Users/cloudine/Downloads" !

  // !! 사용시 출력이 문자열로 리턴
  var result = "ls -alF /Users/cloudine/Downloads/seoul" !!

  println("result = " + result)

  // #| 사용시 한 프로그램의 출력을 다른 프로그램으로 연결 가능
  "ls -alF /Users/cloudine/Downloads" #| "grep seoul" !

  // #> 출력을 파일로 리다이레렉트
  "ls -alF /Users/cloudine/Downloads" #> new File("/Users/cloudine/Downloads/output.txt") !

  // #>> 파일에 삭제하지 않고 붙여여서 쓰기
  "ls -alF /Users/cloudine/Downloads/seoul" #>> new File("/Users/cloudine/Downloads/output.txt") !

  // #< 입력을 파일로부터 리다이렉트
  "grep seoul" #< new File("/Users/cloudine/Downloads/output.txt") !

  // p #&& q (p 가 성공하면 q 를 실행)
  // p #|| q (p 가 실패하면 q 를 실행)

  /*val p = Process("cmd", new File("start directory"), ("key", "value"))

  "echo 42" #| p !*/
}