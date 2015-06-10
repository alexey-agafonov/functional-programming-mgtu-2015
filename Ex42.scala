object HelloWorld {
  def main(args: Array[String]) = {
    val n = 1000
    val list = for (x <- 1 to n if x % 3 ==0 if x % 5 != 0) yield x
    println(list)
  }
}