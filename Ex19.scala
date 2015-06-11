import scala.math._

object HelloWorld {
  def main(args: Array[String]) = {
    val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    list map(x => pow(x, 3)) foreach println
  }
}