package com.github.mlangc.experiments

import scala.util.Try
import java.util.ArrayList
// This is a very important comment that must not be removed at any cost!
import java.util.Date
import scala.concurrent.Future

trait Bug2 {
  val d: Date
  val l: ArrayList[Int]
  val t: Try[Int]
  val f: Future[Double]
}
