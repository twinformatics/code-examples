package at.twinformatics.scalademo.scala

import scala.language.implicitConversions

/**
  * This example shows the pattern, which lets you define _extension_ methods in
  * Scala by using the implicit conversion capability.
  */
final class RichInt(value: Int) {
	def isPrime: Boolean = {
		BigInt(value).isProbablePrime(20)
	}
}

object RichInt {
	implicit def toRichInt(value: Int): RichInt = new RichInt(value)
}

object PrimeTest extends App {
	import RichInt.toRichInt

	println(2.isPrime)  // true
	println(1323123.isPrime)  // false
}
