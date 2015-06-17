object HelloWorld {
  def main(args: Array[String]) = {
    def cntCond(list: List[Int], f: Int => Boolean): Int = {
      def abc( list: List[Int], f: Int => Boolean, acc: Int): Int = list match {
        case Nil => acc
        case head :: tail => {
          if (f(head)) abc(tail, f, acc + 1)
          else abc(tail, f, acc)
        }
      }
      abc(list, f, 0)
    }

    val list = List(10, 20, 30, 400, 51, 1000, 15000)
    println(cntCond(list, x => x >= 0 && x <= 1000))
  }
}