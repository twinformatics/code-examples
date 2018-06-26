package at.twinformatics.scalademo.scala

case class Fraction(num: Long, denom: Long) {
    def *(other: Fraction): Fraction = Fraction(
        num*other.num,
        denom*other.denom
    )
}

object Fraction {
    def apply(v: Long): Fraction = Fraction(v, 1)
}

object FractionTest extends App {
    val a = Fraction(10, 2)
    val b = Fraction(5)
    val c = a*b

    println(Fraction(10, 2).*(Fraction(5)))
    println(Fraction(10, 2) * Fraction(5))
}
