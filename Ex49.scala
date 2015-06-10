object HelloWorld {
  def main(args: Array[String]) = {
      import scala.collection.immutable.Stream
      import scala.math._

      def infList(n: BigInt): Stream[BigInt] = n #:: infList(n * 100 + 56)
      infList(56) take 6 foreach println
  }
}