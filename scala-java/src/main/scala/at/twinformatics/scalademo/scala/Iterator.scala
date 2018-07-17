package at.twinformatics.scalademo.scala

/**
  * As simple example on how to define traits. Traits doesn't require an
  * "abstract" keyword. Just leave out the implementation. The same applies to
  * "default" methods, just give a method implementation.
  */
trait Iterator[T] {
    def hasNext: Boolean
    def next: T
    def remove(): Unit = {
        throw new UnsupportedOperationException()
    }
}
