import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val x = list map(p => pow(3, p))
    print(x)
  }
}