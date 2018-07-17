package at.twinformatics.scalademo.scala

import java.io.File

/**
  * This is a simple pattern matching example. The `describe` method matches on
  * constant values and on types.
  */
object PatternMatching extends App {

    def describe(x: Any): String = x match {
        case 5 => "five"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "the empty list"
        case s: String => s"got string '$s'"
        case _: Number => "a number"
        case _ => "everything else"
    }

    println(describe("hello")) // hi!
    println(describe(5))  // five
    println(describe(6)) // a number
    println(describe(new File("/home"))) // everything else
    println(describe(null)) // everything else

}
