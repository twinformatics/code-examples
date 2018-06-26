package at.twinformatics.scalademo.scala

object DefaultParameter {

    case class Fraction(num: Long, denom: Long = 1)

    def print(s: String, times: Int = 1): Unit = {
        for (i <- 0 until times) println(s)
    }

    def main(args: Array[String]): Unit = {
        println(Fraction(10))
        print("Hello")
        print("World", 3)
        print("Nothing", times = 0)
    }
}
