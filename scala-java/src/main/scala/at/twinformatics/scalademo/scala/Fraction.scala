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
