package chapter6._5

import java.util.Date

/**
 * 6.5 애플리케이션 오브젝트
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */
/*object Hello {
  def main(args: Array[String]) {
    println("Hello, World!")
  }
}*/

/*
object Hello extends App {
  if (args.length > 0) {
    println("Hello, " + args(0))
  } else {
    println("Hello, World!!")
  }

  println("executionStart = " + new Date(executionStart))
}*/

object Hello {
  def fibonacci(number: BigDecimal): BigDecimal = {
    /*if (number == 0 || number == 1) {
      number
    } else {
      fibonacci(number - 1) + fibonacci(number - 2)
    }*/

    @annotation.tailrec
    def process(n0: BigDecimal, n1: BigDecimal, nn: BigDecimal): BigDecimal = {
      if (nn == 0) {
        n0
      } else {
        process(n1, n0 + n1, nn - 1)
      }
    }
    process(0, 1, number - 1)
  }

  def main(args: Array[String]) {
    //0 1 1 2 3 5 8 13 21 34 55 89
//    println("fib(1000) = " + fib(1000))
    val number = 1000
    println("fibonacci(" + number + ") = " + fibonacci(number))
  }
}