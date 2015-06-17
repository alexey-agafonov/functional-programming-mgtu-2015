object HelloWorld {
  def main(args: Array[String]) = {
    val a = for(x <- 0 to 20; y <- 0 to 20 if y >= x) yield (x -> y)
    a foreach println
  }
}