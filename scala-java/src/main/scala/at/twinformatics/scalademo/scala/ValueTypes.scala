package at.twinformatics.scalademo.scala

object ValueTypes extends App {

	implicit class RichInt(val value: Int) extends AnyVal {
		def isPrime: Boolean = {
			BigInt(value).isProbablePrime(20)
		}
	}

	println(2.isPrime)  // true
	println(1323123.isPrime)  // false

	// Actual call
	// RichInt.isPrime(2)
}
