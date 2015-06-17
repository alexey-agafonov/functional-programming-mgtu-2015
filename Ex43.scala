object HelloWorld {
  def main(args: Array[String]) = {
    val a = for(x <- 0 to 10; y <- 0 to 10 if x >= y) yield (x -> y)
    a foreach println
  }
}