import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Int): Unit = n match {
      case 0 => Nil
      case n => {
        abc(n - 1)
        println(2.0 * n / (2 * n - 1))
      }
    }
    abc(3)
  }
}