package at.twinformatics.scalademo.scala

/**
  * Example for a specialized typed class. The compiler will generate extra
  * classes for the `Int` and `Double` types.
  *
  * {{{
  *     // Specialized class for Double type
  *     Complex$mcD$sp.class
  *     // Specialized class for Int type
  * 	Complex$mcI$sp.class
  * }}}
  *
  * @param re the real part
  * @param im the imaginary part
  * @tparam T the complex component type
  */
case class Complex[@specialized(Int, Double)T](re: T, im: T)
