package at.twinformatics.scalademo.scala

/**
  * Example for using type definitions in Scala
  */
object TypeAlias {

    type Property = Map[String, String]
    type IntFunction[+T] = Int => T
    type Consumer[-T] = T => Unit
    type Mapper[-T, +R] = T => R
    type StringMapper[+R] = Mapper[String, R]

    import java.lang.{Double => jdouble}
    import java.util.function.{Function => JFunction}

    type JF = JFunction[String, String]
    val v: jdouble = 4.3

}
