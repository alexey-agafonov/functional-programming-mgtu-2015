import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val list = List(1, 0, 3, 4, -1, 2)
    print(list.foldLeft(list(1)) { (x, y) => x.min(y)})
  }
}