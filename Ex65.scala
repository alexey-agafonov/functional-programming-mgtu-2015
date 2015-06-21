import scala.math._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    def abc: Stream[Double] = {
      var list: Stream[Double] = Stream.Empty
      var list1: Stream[Double] = Stream.Empty
      list = sin(1) #:: list1
      list1 = list map sin
      list
    }
    abc take(10) foreach println
  }
}