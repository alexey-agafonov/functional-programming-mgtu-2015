import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val n = 3
    val a = (1 to n) map (x => 2.0 * x / (2 * x - 1)) foreach println
  }
}