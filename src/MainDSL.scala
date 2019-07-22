import ExprConvertions._
import math._

object test {
  def main(args: Array[String]): Unit = {
    println("hello,world")
    val e = "baba"
    println(e in ("baba", 1, 2))
    println(e notin ("babe", 1, 2))
    println(4 and 3)
    println(4 and 0)
    println(4 > 3 and 5 > 4)
    println(4 < 3 or 5 > 4)
    println("cia".len)

    sqrt(2);
    

  }
}
