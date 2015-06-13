import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Int], n: Int): Int = n match {
      case 0 => list.head
      case n => abc(list.tail, n - 1)
    }
    val list = List(1, 0, 3, 4, -1, 2)
    print(abc(list, 2))
  }
}