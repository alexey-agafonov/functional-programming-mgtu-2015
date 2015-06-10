import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val n = 10
    val z = (1 to 1).map(x => cos(sin(x))).sum
    print(z)
  }
}