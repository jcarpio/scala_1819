// Función identidad:
//  identidad::a->a
//  identidad x = x

object FuncionIdentidad {
  def funcionIdentidad (x:Any):Any = x

  def main(args: Array[String]) {
    print(funcionIdentidad(3));
    print("\n");
    print(funcionIdentidad("abc"));
    print("\n");
    print(funcionIdentidad(List('a, 'b, 'c)));
    print("\n");
    print(funcionIdentidad(List(23, 1, 17, 33, 21, 37)));
    print("\n");
  }
}