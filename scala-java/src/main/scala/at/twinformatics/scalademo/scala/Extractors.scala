package at.twinformatics.scalademo.scala

import scala.util.Try

/**
  * This example shows how to write extractors (implement the `unapply` method)
  * for using it in pattern matching.
  * The state of a data class can be represented by an n-tuple. An extractor
  * takes an instance of a data class and returns (an option) of this state
  * vector.
  */
class Pair(val a: Int, val b: String)

object Pair {
	def apply(a: Int, b: String): Pair = new Pair(a, b)
	def unapply(ext: Pair): Option[(Int, String)] = {
		Some(ext.a, ext.b)
	}
}

/**
  * It is also possible to define a single `unapply` method in an object. This
  * kind of extractor is handy when you need to implement simple string parsing
  * methods.
  */
object IntEntry {
    def unapply(s: String): Option[(String, Int)] = {
        val split: Array[String] = s.split(":")
        if (split.length == 2) {
            Try(split(1).toInt).toOption.map((split(0), _))
        } else {
            None
        }
    }
}

case class Point(x: Int, y: Int)
case class Line(start: Point, end: Point)

object ExtractorTest extends App {
    def process(any: Any): Unit = any match {
		case Pair(a, b) => println(s"Got: $a and $b")
        case IntEntry(name, value) => println(s"Got Entry[$name, $value]")
        case Point(x, y) if x < y => println(s"Point[$x, $y]")
        case Line(Point(x, _), Point(_, y)) => println(s"Start x: $x, End y: $y")
		case _ => println(s"Unknown: $any")
	}

	process(Pair(1, "2")) // Got: 1 and 2
	process("Some Value") // Unknown: Some Value
    process("count:12") // Got Entry[count, 12]
    process("count:12.2") // Unknown: count:12.2
    process("invalid") // Unknown: invalid
    process(Point(1, 2)) // Point[1, 2]
    process(Line(Point(1, 2), Point(3, 4))) // Start x: 1, End y: 4
}



