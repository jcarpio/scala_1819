// https://docs.scala-lang.org/tour/for-comprehensions.html

object comprehension_list extends App {

  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
      yield (i, j)

  foo(10, 10) foreach {
    case (i, j) =>
      println(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
  }
}