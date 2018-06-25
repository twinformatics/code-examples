package at.twinformatics.scalademo.scala

trait Iterator[T] {
    def hasNext: Boolean
    def next: T
    def remove(): Unit = throw new UnsupportedOperationException()
}
