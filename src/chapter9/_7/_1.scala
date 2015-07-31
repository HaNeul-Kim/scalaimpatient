package chapter9._7

import java.io.File
import java.nio.file._
import java.nio.file.attribute.BasicFileAttributes

/**
 * 9.7 디렉토리 방문
 *
 * 디렉토리 내에 ㅁ모든 파일을 조회하거나 모든 디렉토리를 재귀적으로 조회하는 공식적인 스칼라 클래스는 없음
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
object _1 extends App {
  val dir = new File("/Users/cloudine/Downloads")

  /*def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  for (d <- subdirs(dir)) {
    println("d = " + d)
  }*/

  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  Files.walkFileTree(dir.toPath, (f: Path) => println(f))
}
