object HelloWorld {
  def main(args: Array[String]) = {
      import scala.collection.immutable.List

      val a: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8), List(0))

      for (i <- a) println(i.head)
  }
}