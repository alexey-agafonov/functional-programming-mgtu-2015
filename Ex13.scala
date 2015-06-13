import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Int], n: Int): List[Int] = n match {
      case _ if (n > list.length) => list
      case 0 => Nil
      case n => {
        list.head :: abc(list.tail, n -1)
      }
    }
    val a = List(1, 2, 3, 4, 5)
    abc(a, 1) foreach println
  }
}