import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val n = 10
    val z = for(x <- 1 to n if cos(x) < 0 if sin(x) < 0) yield x
    print(z)
  }
}