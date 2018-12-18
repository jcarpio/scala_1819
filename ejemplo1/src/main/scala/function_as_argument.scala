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

  def executeNTimes(f: () => Unit, n: Int) {
    for (i <- 1 to n) f()
  }

  def helloWorld(): Unit = { println("Hello, world") }

  def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int): Unit = {
    val result = f(x, y)
    println(result)
  }

  def multiply(x: Int, y: Int) = x * y

  def main(args: Array[String]) {
    print(sayHello(helloAl));
    print("\n");
    print(runAFunction(printAnInt));
    print("\n");
    print(runAFunction(plusTen));
    print("\n");
    print(executeNTimes(helloWorld, 3));
    print("\n");
    executeAndPrint(sum, 3, 11)       // prints 14
    print("\n");
    executeAndPrint(multiply, 3, 9)   // prints 27
  }
}