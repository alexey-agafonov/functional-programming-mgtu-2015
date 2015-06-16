import scala.annotation.tailrec

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[List[Int]]): List[Int] = {
      @tailrec
      def cba(l: List[Int], acc: Int): Int = {
        l match {
          case Nil => acc
          case l => cba(l.tail, acc + 1)
        }
      }
      list match {
        case Nil => Nil
        case x => cba(list.head, 0) :: abc(list.tail)
      }
    }
    val list1 = List(List(1, 2, 3), List(1, 2, 3), List(1, 2, 3), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))
    print(abc(list1))
  }
}

//    def abc(list: List[List[Int]], acc: List[Int]): List[Int] = {
//      if (list.isEmpty) acc
//      else abc(list.tail, length(list.head, 0) :: acc)
//    }
//
//    def length(list: List[Int], acc: Int): Int = {
//      if (list.isEmpty) acc
//      else length(list.tail, acc + 1)
//    }