object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Int): Unit = n match {
      case 0 => Nil
      case n  => {
        abc(n - 1)
        println(n + 100 * n * n)
      }
    }
    abc(3)
  }
}