import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def min(list: List[Int]): Int = {
      def abc(list: List[Int], n: Int): Int = list match {
        case Nil => n
        case h :: tail => {
          val m = if (h > n) h else n
          abc(tail, m)
        }
      }
      abc(list, 0)
    }
    val list = List(1, 0, 3, 4, -1, 2)
    print(min(list))
  }
}