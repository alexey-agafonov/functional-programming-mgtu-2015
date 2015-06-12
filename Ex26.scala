object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Int]): Boolean = {
      list match {
        case Nil => false
        case head :: Nil => true
        case x :: tail => {
          if (x > tail.head) abc(tail)
          else return false
        }
      }
    }

    val a = 1 :: 0 :: 2 :: 4 :: 5 :: Nil
    val b = 8 :: 7 :: 6 :: 2 :: 1 :: Nil
    println(abc(a))
    println(abc(b))
  }
}