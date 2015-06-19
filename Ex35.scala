import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(x: (Int, Int), y: (Int, Int), z: (Int, Int)): Boolean = {
      val g1 = (pow(abs(x._1 - y._1), 2) + pow(abs(x._2 - y._2), 2))
      val g2 = (pow(abs(x._1 - z._1), 2) + pow(abs(x._2 - z._2), 2))
      val g3 = (pow(abs(y._1 - z._1), 2) + pow(abs(y._2 - z._2), 2))
      if (g1 == g2 + g3 || g2 == g1 + g3 || g3 == g1 + g2) true
      else false
    }
    println(abc((-3, 1), (2, 4), (2, 1)))
    println(abc((0, 0), (0, 20), (20, 20)))
    println(abc((0, 0), (0, 20), (20, 18)))
  }
}