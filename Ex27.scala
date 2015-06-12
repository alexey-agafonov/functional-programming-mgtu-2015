object HelloWorld {
  def abc(list: List[List[Int]]): Boolean = {
    if (!list.isEmpty) {
      for (x <- list.head)
        if (x < 0) return false
      abc(list.tail)
    }
    else true
  }

  def main(args: Array[String]) = {
    val a = List(List(1, 2, 3), List(1, 2, -3), List(-1, 2))
    print(abc(a))
  }
}