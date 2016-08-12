/**
  * Created by docker on 12/08/16.
  *
    El nombre de la clase actúa como constructor, el cual toma en número de parámetros necesarios.
    La herencia se utiliza con la palabra extends, si queremos reutilizar implementaciones de código ya hecho, esta es la opción mas fácil.
    Se pueden "override" tanto atributos como métodos.
  */
object Objetos {

  class Point( val xx : Int, val yy : Int){
    var x: Int = xx;
    var y: Int = yy;

    def move( dx: Int , dy: Int) = {
      x = x  + dx;
      y = y + dy;

      System.out.println(x + " " + y )
    }
  }

  //Cuando haces un override, el nombre de las variables del constructor tienen que ser iguales.
  //Esto sirve para no repetir código.
  class location(override val xx: Int, override val yy:Int , val zz:Int) extends Point(xx, yy){
    var z : Int = zz;

    def move( dx:Int, dy:Int, dz:Int)={
      x = x + dx;
      y = y + dy;
      z = z + dz;
    }

    def printResults(  )={
      System.out.println(x + " " + y + " " + z);
    }
  }

  def main( args : Array[String])={

    val x = new Point(10,20);
    x.move(5,5)

    val x2 = new location(10,20,30);
    x2.printResults()
    x2.move(5,5,5)
    x2.printResults()

  }
}
