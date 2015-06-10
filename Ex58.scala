import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Int): List[Int] = (for (i <- 1 to n) yield i) toList
    def cba(n: Int): List[Double] = (for (i <- 1 to n) yield sqrt(i)) toList

    def dcp(list1: List[Int], list2: List[Double]): List[Double] = {
      if (list1.isEmpty || list2.isEmpty) Nil
      else list1.head :: list2.head :: dcp(list1.tail, list2.tail)
    }
    val a = dcp(abc(10), cba(10)) foreach println
  }
}