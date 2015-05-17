import scala.collection.immutable.List

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val list = List(-100, 50, 47, 98, 0, 100, 14, -26, 80)
    println(
      list.foldLeft(list(1)) { (x, y) => x.max(y)}
    )
  }
}