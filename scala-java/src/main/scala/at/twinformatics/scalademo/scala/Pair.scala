package at.twinformatics.scalademo.scala

class Pair(val a: Int, val b: String)

object Pair {
	def apply(a: Int, b: String): Pair = new Pair(a, b)
	def unapply(ext: Pair): Option[(Int, String)] = {
		Some(ext.a, ext.b)
	}
}

object ExtractorApp extends App {
	def process(any: Any): Unit = any match {
		case Pair(a, b) => println(s"Got: $a and $b")
		case _ => println(s"Unknown: $any")
	}

	process(Pair(1, "2"))
	process("Some Value")
}

// Got: 1 and 2
// Unknown: Some Value
