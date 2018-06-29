package at.twinformatics.scalademo.scala

/**
  * Scala lets you define methods/function with more than one parameter list.
  * Using _currying_ you are able to create new functions by applying arguments
  * to only a part of this parameter lists.
  */
object Currying extends App {

    def modN(n: Int)(x: Int) = (x%n) == 0

    val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
    println(nums.filter(modN(2)))
    println(nums.filter(modN(3)))

    // List(2, 4, 6, 8)
    // List(3, 6)
}
