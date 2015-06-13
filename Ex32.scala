import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    def abc(list: List[Double]): Double = {

      def acc(list: List[Double], mult: Double, sum: Double): Double = list match {
        case Nil => mult / sum
        case x :: tail => {
          acc(tail, mult * x, sum + sin(x))
        }
      }
      acc(list, 1, 0)
    }

    val a = List(1.0, 2, 3, 4)
    print(abc(a))
  }
}