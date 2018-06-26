package at.twinformatics.scalademo.scala

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