// Tenemos diferentes posibilidades a la hora de definir funciones:
//  - Utilizando varias ecuaciones (escribiendo cada ecuación en una línea)
//  - Guardas (en inglés “guards”, barreras, defensas, “|”)
//  - If then else
//  - Case
//  - En definiciones locales

object factorial {

  // In Scala:
  //
  def foo1(x: Int, y: Int): Int = {
    val a = x + y
    var b = x * y
    a - b
  }
  //
  //In Haskell:
  //
  //foo :: Integer -> Integer -> Integer
  //foo x y = a - b
  //        where
  //          a = x + y
  //          b = x * y
  //
  //Local `def`
  //
  //In Scala
  //
  def foo2(x: Int, y: Int): Int = {
    def bar(x: Int) = x * x
    y + bar(x)
  }
  //
  //In Haskell
  //
  //foo :: Integer -> Integer -> Integer
  //foo x y = y + bar x
  //         where
  //           bar x = x * x

  def main(args: Array[String]): Unit = {
    print(foo1(1, 2))
    print("\n")
    print(foo2(1, 2))
    print("\n")
  }
}