import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(n: Double): Stream[Double] = n #:: abc(n * -1)
    def infList(n: Double): Stream[Double] = n #:: infList(n + 1)
    abc(-0.1) take 5 foreach println
    abc(-0.1) zip infList(1) map(p => p._1 + p._2) foreach println
  }
}