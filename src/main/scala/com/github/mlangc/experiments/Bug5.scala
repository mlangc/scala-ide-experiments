package com.github.mlangc.experiments

trait Bug5 {
  import scala.util.{Try => `Evil....`}
  import scala.concurrent.Future

  def f: Future[`Evil....`[Int]] = ???
}
