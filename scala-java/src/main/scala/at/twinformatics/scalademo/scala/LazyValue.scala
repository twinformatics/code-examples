package at.twinformatics.scalademo.scala

/**
  * This example shows the useage of "lazy" values. They are evaluated on their
  * first usage.
  */
object LazyValue extends App {

    lazy val lazyValue: String = {
        println("Initialize lazy value")
        "Lazy value"
    }

    val eagerValue: String = {
        println("Initialize eager value")
        "Eager value"
    }

    println("Starting program")
    println(lazyValue)
    println(eagerValue)

    // Program output:
    // Initialize eager value
    // Starting program
    // Initialize lazy value
    // Lazy value
    // Eager value
}
