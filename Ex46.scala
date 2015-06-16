object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Int): List[String] = {
      def cba(n: Int, z: Int): List[String] = n match {
        case 0 => Nil
        case n => cba(n - 1, z + 1) ++ List[String]("!" * (n + z))
      }
      cba(n, 0)
    }
    print(abc(4))
  }
}