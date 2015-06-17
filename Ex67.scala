object HelloWorld {
  def main(args: Array[String]) = {
    def cntCond(list: List[Int], f: Int => Boolean): Int = {
      def abc(l: List[Int], f: Int => Boolean, acc: Int): Int = l match{
        case Nil => acc
        case head :: tail => {
          if (f(head)) abc(tail, f, acc + 1)
          else abc(tail, f, acc)
        }
      }
      abc(list, f, 0)
    }
    val list = List(1, 2, 3, 4, 5)
    print(cntCond(list, x => x % 3 == 0))
  }
}