import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val n = 3
    val list = (1 to n) map (x => x + 100 * x * x) foreach println
  }
}