package at.twinformatics.scalademo.scala

import java.io.ByteArrayInputStream

import scala.io.Source

object StructuralTypes {

	def using[C <: {def close(): Unit}, T](closeable: C)(block: C => T) = {
		try {
			block(closeable)
		} finally {
			try {
				closeable.close()
			} catch {
				case ignore: Exception =>
			}
		}
	}

	val stream = new ByteArrayInputStream("hello".getBytes)
	val msg = using(stream) { in =>
		Source.fromInputStream(in).mkString
	}

}
