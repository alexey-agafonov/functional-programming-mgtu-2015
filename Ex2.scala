object HelloWorld {
  def main(args: Array[String]): Unit = {
    var m = collection.mutable.Map[Char, Int]().withDefaultValue(0)
    val str = "aAaaAbbbbb"
    str.map(_ toUpper).map(x => m.update(x, m(x) + 1))
    print(m.maxBy(_._2)._1)
  }
}