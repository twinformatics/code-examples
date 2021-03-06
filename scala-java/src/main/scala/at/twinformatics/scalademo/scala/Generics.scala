package at.twinformatics.scalademo.scala

/**
  * Example on how to use declaration side and use side generic variance
  * definition.
  */
object Generics {

    trait Iterator[+T] {
        def hasNext: Boolean
        def next: T
    }

    val strings: Iterator[String] = null
    val objects: Iterator[AnyRef] = strings
    val integers: Iterator[Integer] = null

    def iterate(it: Iterator[Number]): Unit = ()
    def iterate2[T <: Number](it: Iterator[T]): Unit = ()

    iterate(integers)
    iterate2(integers)
}
