package at.twinformatics.scalademo.scala

object PatternMatching {

    def describe(x: Any): String = x match {
        case 5 => "five"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "the empty list"
        case s: String => s"got string '$s'"
        case _: Number => "a number"
        case _ => "everything else"
    }

}
