object HelloWorld {
  def main(args: Array[String]) = {
    def checkCond(list: List[Int], f: Int => Boolean): Boolean = list match {
      case Nil => false
      case head :: Nil => true
      case head :: tail => {
        if (!f(head)) false
        else checkCond(tail, f)
      }
    }
    val list = List(1, 2, 3, 4, 5)
    println(checkCond(list, x => x + 2 < 10))
    println(checkCond(list, x => x % 2 == 0))
  }
}