package at.twinformatics.scalademo.scala

case class Complex[@specialized(Int, Double)T](re: T, im: T)
