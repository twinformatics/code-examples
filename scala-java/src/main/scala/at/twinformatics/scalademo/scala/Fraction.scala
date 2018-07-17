package at.twinformatics.scalademo.scala

/**
  * Simple implementation of a numeric fraction.
  *
  * @param num the numerator
  * @param denom the denominator
  */
case class Fraction(num: Long, denom: Long) {
    /**
      * A multiply operator can be implemented as normal method. Scala allows
      * to skip the point '.' and the parentheses '()' when calling a method.
      * Instead of `f1.*(f2)` you can just write `f1*f2`.
      * You can also skip the curly braces from the method body if it consist
      * only of one expression.
      *
      * @param other the other fraction instance
      * @return a new fraction object which is the multiplication of `this` and
      *         `other`
      */
    def *(other: Fraction): Fraction = Fraction(
        num*other.num,
        denom*other.denom
    )
}

/**
  * The companion object of the `Fraction` class
  */
object Fraction {
    /**
      * Creates a new `Fraction` object from the given value.
      *
      * @param v the fraction value. The denominator is set to one.
      * @return a new fraction class from the given value
      */
    def apply(v: Long): Fraction = Fraction(v, 1)
}

object FractionTest extends App {
    val a = Fraction(10, 2)
    val b = Fraction(5)
    val c = a*b

    println(Fraction(10, 2).*(Fraction(5)))
    println(Fraction(10, 2) * Fraction(5))
}
