package at.twinformatics.scalademo.scala

/**
  * This example shows how to use the `Nothing` type. The definition of a
  * `Nothing` return value indicates that the method will *always* terminate
  * *abnormally*. This can be a `System.exit` or a thrown exception.
  */
object Nothings {

    def toInt(s: String): Int = {
        if (s.nonEmpty) s.toInt
        else raiseError()
    }

    def raiseError(): Nothing = {
        throw new AssertionError("Got empty string.")
    }

    def systemExit(code: Int): Nothing = sys.exit(code)

}