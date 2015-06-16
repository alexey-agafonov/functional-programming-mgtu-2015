object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Int]): Boolean = {
      list match {
        case Nil => false
        case head :: Nil => true
        case x :: tail => {
          if (x * tail.head < 0) abc(tail)
          else return false
        }
      }
    }
    val list = List(1, -1, 2, -1, 3)
    val list1 = List(-1, 1, -1, 2, 1)
    println(abc(list))
    println(abc(list1))
  }
}