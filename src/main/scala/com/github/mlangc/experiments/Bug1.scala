package com.github.mlangc.experiments

trait Bug1 {
  import java.util.Date
  import java.util.ArrayList
  /**
   * This is a very important message that must not be removed!
   */
  import scala.util.Try
  import scala.concurrent.Future
  import scala.concurrent.Future

  val d: Date
  val l: ArrayList[Int]
  val t: Try[Int]
  val f: Future[Double]
}
