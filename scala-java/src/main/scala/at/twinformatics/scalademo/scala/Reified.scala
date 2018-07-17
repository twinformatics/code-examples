package at.twinformatics.scalademo.scala

import scala.reflect.ClassTag

/**
  * Normally, the actual generic type is not available at runtime (thanks to
  * erasure). Sometimes it is useful knowing the erased type. Scala lets you
  * define a second parameter list with an implicit `ClassTag`. This tag is
  * automatically added by the Scala compiler. No need to specify it manually.
  * With the `ClassTag` it is possible to get the runtime type of the generic
  * type `T`.
  */
object Reified extends App {

	def array[T <: AnyRef](length: Int)(implicit tag: ClassTag[T]): Array[T] = {
		val a = new Array[T](length)
		for (i <- 0 until length) {
			a(i) = tag.runtimeClass.newInstance().asInstanceOf[T]
		}
		a
	}

	val a1: Array[String] = new Array(5)
	val a2: Array[String] = array(5)

	println(a1.mkString("[", ",", "]"))
	println(a2.mkString("[", ",", "]"))

	// [null,null,null,null,null]
	// [,,,,]
}
