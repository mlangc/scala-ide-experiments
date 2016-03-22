package com.github.mlangc.experiments

trait Bug5 {
  import scala.util.{Try => `Böse....`}
  import scala.concurrent./*Belze.Bub*/Future

  def f: Future[`Böse....`[Int]] = ???
}