// Función iguales:
// iguales::a->a->a->Bool
// iguales x y z = x==y && y==z

object FuncionIguales {
  def funcionIguales (x:Any, y:Any, z:Any):Boolean = x == y && y == z

  def main(args: Array[String]) {
    print(funcionIguales(1,1,1));
    print("\n");
    print(funcionIguales('a,'b,'c));
    print("\n");
    print(funcionIguales('a,'a,'a));
    print("\n");

  }
}