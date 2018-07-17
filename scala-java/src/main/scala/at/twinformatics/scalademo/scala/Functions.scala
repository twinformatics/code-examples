package at.twinformatics.scalademo.scala

/**
  * Some examples on how to define function objects.
  */
object Functions extends App {
    val f1: (String => Int) = s => s.toInt
    val f1a: (String => Int) = _.toInt
    val f2: String => Int = Integer.parseInt
    val f3 = (s: String) => s.toInt

    val value1: Int = f1.apply("4")
    val value2: Int = f1("3")

    println(value1) // 4
    println(value2) // 3
}
