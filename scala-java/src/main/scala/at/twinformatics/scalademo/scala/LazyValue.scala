package at.twinformatics.scalademo.scala

object LazyValue {

    lazy val lazyValue: String = {
        println("Initialize lazy value")
        "Lazy value"
    }

    val eagerValue: String = {
        println("Initialize eager value")
        "Eager value"
    }

    def main(args: Array[String]): Unit = {
        println("Starting program")
        println(lazyValue)
        println(eagerValue)
    }
}
