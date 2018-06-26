package at.twinformatics.scalademo.scala

/**
  * Sealed base class of an Algebraic Data Type. All implementations of the
  * `Expr` class must be defined in the same compilation unit (this is usually
  * the same file).
  */
sealed abstract class Expr

final case class Var() extends Expr
final case class Const(v: Double) extends Expr
final case class Add(x: Expr, y: Expr) extends Expr
final case class Sub(x: Expr, y: Expr) extends Expr
final case class Mul(x: Expr, y: Expr) extends Expr
final case class Div(x: Expr, y: Expr) extends Expr

object eval extends App {
	def apply(expr: Expr, value: Double): Double = expr match {
		case Var() => value
		case Const(x) => x
		case Add(x, y) => eval(x, value) + eval(y, value)
		case Sub(x, y) => eval(x, value) - eval(y, value)
		case Mul(x, y) => eval(x, value) * eval(y, value)
		case Div(x, y) => eval(x, value) / eval(y, value)
	}

	val expr = Add(Const(3), Sub(Mul(Var(), Const(10)), Const(4)))
	println(eval(expr, 1))
}
