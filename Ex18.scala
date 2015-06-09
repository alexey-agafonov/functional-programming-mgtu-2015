object HelloWorld {
  def main(args: Array[String]): Unit = {
    val n = 5
    val x = (1 to n).map(i => math.sin(i) * math.cos(i)).sum
    print(x)
  }
}