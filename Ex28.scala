object HelloWorld {
    def main(args: Array[String]): Unit = {
        import scala.collection.immutable.Stream
        import scala.math._

        def infList(n: BigInt): Stream[BigInt] = n #:: infList(n * 100 + 3)
        infList(3) take 6 foreach println
    }
}