object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Int], n: Int): Int = n match {
      case 0 => list.head
      case n => abc(list.tail, n - 1)
    }

    val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    print(abc(list, 2))
  }
}