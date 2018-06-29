package at.twinformatics.scalademo.scala

/**
  * Value types tries to avoid object creation, when they are used. A typical
  * example is making extension classes a value class. This converts the
  * object creation and the method call into a static method call without
  * object creation.
  */
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
