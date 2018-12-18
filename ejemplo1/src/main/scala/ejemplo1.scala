import quitaBlancos._

object quitaBlancos {

  def quitablancos( cadena: String ): String =
    if ( cadena.charAt(0) == ' ')
      quitablancos( cadena.substring( 1 ));
    else
      cadena;




  def main(args: Array[String]){

    print( quitablancos(" hola"));

  }
}