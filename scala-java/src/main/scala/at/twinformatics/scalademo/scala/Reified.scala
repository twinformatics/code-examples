package at.twinformatics.scalademo.scala

import scala.reflect.ClassTag

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
