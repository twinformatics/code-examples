package at.twinformatics.scalademo.scala

import scala.language.dynamics

/**
  * This example shows the usage of dynamic types. This means that the method
  * calls are mapped to the `applyDynamic` method of the _dynamic_ type.
  */
object DynamicType extends App {

	object Arithmetic extends Dynamic {
		def applyDynamic(methodName: String)(args: Int*): Int = {
			methodName match {
				case "add" => args.sum
				case "mul" => args.product
				case _ => throw new UnsupportedOperationException()
			}
		}
	}

	println(Arithmetic.add(1, 2, 3, 4)) // 10
	println(Arithmetic.mul(1, 2, 3, 4)) // 24
	println(Arithmetic.div(4, 2))       // Exception

}
