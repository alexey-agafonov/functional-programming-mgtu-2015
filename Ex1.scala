object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Int): Int = n match {
      case 1 => 1
      case 2 => 2
      case n =>  abc(n - 1)* abc(n - 2)
    }
    print(abc(7))
  }
}