package at.twinformatics.scalademo.scala

import scala.language.implicitConversions

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
