object HelloWorld {
  def evenRec(list: List[List[Int]]): Boolean = {
    if (list.isEmpty) return false
    for (xs <- list; x <- xs)
      if (x % 2 == 0)
        return true
    false
  }

  def main(args: Array[String]) = {
    val a = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9, 0))
    val eR = evenRec(a)
    print(eR)
  }
}