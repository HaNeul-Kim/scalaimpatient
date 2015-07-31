package chapter9._5

import java.io.{FileInputStream, File}

/**
 * 9.5 바이너리 파일 읽기
 *
 * 스칼라는 바이너리 파일 읽느는 방법이 없으므로 자바 라이브러리 사용
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val file = new File("/Users/cloudine/Downloads/seoul/seoul.shp")
  val in = new FileInputStream(file)
  val bytes = new Array[Byte](file.length.toInt)
  in.read(bytes)
  for (byte <- bytes) {
    print(byte)
  }
  in.close
}
