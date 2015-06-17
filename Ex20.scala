object HelloWorld {
  def main(args: Array[String]) = {
    def sumCond(list: List[Int], f: Int => Boolean): Int =  {
      def abc(list: List[Int], f: Int => Boolean, acc: Int): Int = list match {
        case Nil => acc
        case head :: tail => {
          if (f(head)) abc(tail, f, head + acc)
          else abc(tail, f, acc)
        }
      }
      abc(list, f, 0)
    }

    val list = List(10, 20, 30, 400, 51)
    print(sumCond(list, x => x >= 10 && x <= 50))
  }
}