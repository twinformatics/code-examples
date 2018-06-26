package at.twinformatics.scalademo.scala

import java.util.Random

/**
  * This example shows how to use implicits for simple dependency injection.
  */
object Implicits extends App {

    private val CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    def randomString(length: Int)(implicit r: Random): String = {
        Stream.continually(CHARS.charAt(r.nextInt(CHARS.length)))
            .take(length)
            .mkString
    }

    println(randomString(10)(new Random()))

    // Bringing the random engine in scope for the `randomString' method.
    implicit val random: Random = new Random(123)
    println(randomString(15))

}
