package at.twinformatics.scalademo.scala

/**
  * This example show the definition and usage of _default_ and _named_
  * parameters.
  */
object DefaultParameter extends App {

    case class Fraction(num: Long, denom: Long = 1)

    def print(s: String, times: Int = 1): Unit = {
        for (i <- 0 until times) println(s)
    }

    println(Fraction(10))
    print("Hello")
    print("World", 3)
    print("Nothing", times = 0)
}
