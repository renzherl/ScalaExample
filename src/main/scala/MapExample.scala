/**
  * Created by mi on 2017/11/23.
  */

import scalaz.Scalaz._
import scalaz._

object MapExample {

  def mapAddExample() = {
    val map1 = scala.collection.immutable.Map(1 -> 3, 2 -> 4)
    val map2 = scala.collection.immutable.Map(1 -> 1, 3 -> 6)
    println(map1 |+| map2)
  }

  def wordCountExample() ={
    val words1 = "Hello World Bye World"
    val words2 = "Hello Hadoop Goodbye Hadoop"
    val input = List(words1,words2)

    val mapped = input.flatMap(_.split(" ").map(word => Map(word -> 1)))
    println(mapped.suml)

  }

  def main(args: Array[String]): Unit = {
    mapAddExample()
    wordCountExample()
  }
}
