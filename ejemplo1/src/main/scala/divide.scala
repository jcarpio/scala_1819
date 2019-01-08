
// Función divide
// divide::Fractional a => a -> a -> a
// divide x y = x / y

object FuncionDivide {
  def funcionDivideInt(x: Int, y: Int): Int = x / y

  def funcionDivideFloat(x: Int, y: Int): Float = x / y

  def funcionDivideFloat2(x: Float, y: Float): Float = x / y

  def main(args: Array[String]) {
    print(funcionDivideInt(1, 2));
    print("\n");
    print(funcionDivideFloat(1, 2));
    print("\n");
    print(funcionDivideFloat2(1, 2));
    print("\n");
  }
}