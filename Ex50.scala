import scala.math._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    def abc: Stream[Double] = {
      var lst0: Stream[Double] = Stream.Empty
      var lst: Stream[Double] = Stream.Empty
      var lst1: Stream[Double] = Stream.Empty
      lst0 = sin(1) #:: lst
      lst1 = lst0 map sin
      lst = 1 #:: lst1
      lst
    }
    abc take(10) foreach println
  }
}