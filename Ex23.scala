import scala.math._

object HelloWorld {
    def main(args: Array[String]) = {
        val list: List[BigInt] = List(0, 50, 47, 98, 100, 14, 26, 80)
        println(list.filter(x => x % 2 == 0).foldRight(list(0)) { (x, y) => x + y})
    }
}