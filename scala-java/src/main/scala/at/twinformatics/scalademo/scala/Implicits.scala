package at.twinformatics.scalademo.scala

import java.util.Random

object Implicits {

    private val CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    def randomString(length: Int)(implicit r: Random): String = {
        Stream.continually(CHARS.charAt(r.nextInt(CHARS.length)))
            .take(length)
            .mkString
    }

    def main(args: Array[String]): Unit = {
        println(randomString(10)(new Random()))

        implicit val random: Random = new Random(123)
        println(randomString(15))
    }

}
