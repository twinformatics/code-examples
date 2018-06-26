package at.twinformatics.scalademo.scala

import java.io.IOException
import java.nio.file.Path
import java.nio.file.Files.readAllBytes

/**
  * This example shows the advanced possibilities of Scala exception handling
  * using `PartialFunction`s as exception handler.
  */
object ExceptionHandling {

    def readText1(file: Path): Option[String] = {
        try {
            Some(new String(readAllBytes(file)))
        } catch {
            case e: IOException
                if e.getMessage.contains("Fatal") => throw e
            case e: IOException => None
        }
    }

    def readText2(file: Path): Option[String] = {
        try {
            Some(new String(readAllBytes(file)))
        } catch {
            handler(false)
        }
    }

    def handler(ignoreNull: Boolean):
    PartialFunction[Throwable, Option[String]] = {
        case e: NullPointerException if ignoreNull => None
        case _: IOException => None
    }

}
