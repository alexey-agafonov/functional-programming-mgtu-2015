object HelloWorld {
  def main(args: Array[String]) = {
    val a = for (x <- 1 to 100) yield x * x
    a foreach println
  }
}