package my.app

import java.time.LocalDate

object HelloWorld extends App {

  val list: List[Int] = List(1, 2, 3)
  val x = list.groupBy(identity).mapValues(_.size)
  // val x = list.groupBy(identity).view.mapValues(_.size).toMap
  val y = Stream(1, 2, 3).append(Stream(4, 5, 6))
  println(x.toList)
  println(y.toList)
}
