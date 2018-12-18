object function_as_argument {

  def helloAl(): Unit = { println("Hello, Al") }

  def sayHello(callback:() => Unit) {
         callback()
  }

  def sum(a: Int, b: Int): Int = a + b
  def product(a: Int, b: Int): Int = a * b
  def subtract(a: Int, b: Int): Int = a - b

  def printAnInt (i: Int): Unit = { println(i+1) }

  def plusTen(i: Int) { println(i+10) }

  def runAFunction(f: Int => Unit): Unit = {
    f(42)
  }

  def main(args: Array[String]) {
    print(sayHello(helloAl));
    print("\n");
    print(runAFunction(printAnInt));
  }
}