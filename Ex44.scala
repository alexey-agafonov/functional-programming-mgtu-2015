import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val list: List[BigInt] = List(-100, 50, 47, 98, 100, 14, -26, 80)
      println(list.filter(x => x % 10 == 0).foldLeft(list(1)) { (x, y) => x * y})
  }
}