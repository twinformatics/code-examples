package at.twinformatics.scalademo.scala

import scala.annotation.tailrec

/**
  * Example for a classical tail-recursive function. Scala is able to compile a
  * tail-recursive function into an iterative version.
  */
object TailRecursion {

    // @tailrec // Won't compile into tailrec version.
    def fibrec(n: Int): Int = n match {
        case 0 | 1 => n
        case _ => fibrec(n - 1) + fibrec(n - 2)
    }

    @tailrec
    def fib(x: Long, prev: Long = 0, next: Long = 1): Long = x match {
        case 0 => prev
        case 1 => next
        case _ => fib(x - 1, next, next + prev)
    }

    def main(args: Array[String]): Unit = {
        println(fibrec(10))
        println(fib(10))
    }

}
