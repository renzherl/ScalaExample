import scala.util.Try

/**
  * Created by mi on 6/2/2017.
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val a = 10
    val b = 20
    val c = 25
    val d = 25
    println("a + b = " + add(a, b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))

    println("multi(1) value = " + multi(1))

    var buf = new StringBuilder()
    buf += 'a';
    buf ++= "bcdef";
    println("buf is: " + buf);

    var myList: Array[Double] = Array(1.9, 2.9, 3.4, 3.5);
    for (x <- myList)
      println(x);

    val source: String = null;
    var target: Option[Double] = parseDouble(source)
    println("Double target: ", target)

  }

  def add(a: Int, b: Int): Int = {
    return a + b;
  }

  var factor = 3;
  var multi = (i: Int) => i * factor;

  def parseDouble(s: String): Option[Double] = Try {
    s.toDouble
  }.toOption

  private def stringToDouble(str: String): Double = {
    try {
      str.toDouble
    } catch {
      case _ => Double.NaN
    }
  }

}
