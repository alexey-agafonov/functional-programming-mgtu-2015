import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def list(n: BigInt): Stream[BigInt] = n #:: list(n * -1)
    def infList(n: BigInt): Stream[BigInt] = n #:: infList(n + 1)
    list(1) take 10 foreach println
    list(1) zip infList(1) map(p => p._1 * p._2) foreach println
  }
}