package at.twinformatics.scalademo.scala

object Functions {

    val sqr: (Int => Int) = v => v*v

    val sqr1: Function[Int, Int] = v => v*v

    val result: Int = sqr.apply(3)
    val result2: Int = sqr(3)

    type JFunc[A, B] = java.util.function.Function[A, B]

    def eval1(f: JFunc[String, Int]): Int = f.apply("2")

    def eval2(f: String => Int): Int = f("2")

    val r1: Int = eval1(Integer.parseInt(_))

    val r2: Int = eval2(Integer.parseInt)

    val r3: Int = eval1(Integer.parseInt)

    val f1: JFunc[String, Int] = Integer.parseInt


    val f2: (String => Int) = Integer.parseInt

    def apply(f: java.util.function.Function[String, Int]): Int = 2

    def apply2(f: (String => Int)): Int = 3

    val a: Int = apply(s => Integer.parseInt(s))

    val b: Int = apply(Integer.parseInt)

    val d: Int = apply2(Integer.parseInt)

    val f: (String => Int) = Integer.parseInt

    val c: Int = apply(f)

    val e: Int = apply2(f)


    def foo(s: String)(i: Int): Int = 1

    val b: (Int => Int) = foo("foo")


    def foo1(s: String, i: Int): Int = 1

    val c: (Int => Int) = foo1("foo", _)

}
