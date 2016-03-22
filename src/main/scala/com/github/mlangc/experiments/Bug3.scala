package com.github.mlangc.experiments

import scala.concurrent.Future

object Bug3 {
  class Other {
    type Tpe1 = Int
    type Tpe2 = Double
    type Tpe3 = String
  }
}

trait Bug3 {
  import scala.util./*evil.evil*/Try
  import Bug3._
  import scala.concurrent.Future

  val other: Other

  def f: Future[Int] = {
    import other.{ Tpe1 => Dpe0 }
    import other.Tpe2

    def z: Dpe0 = {
      val x: Dpe0 = 12
      val y: Tpe2 = 0.0
      x + y.toInt
    }

    Future.successful(Try(z).getOrElse(42))
  }

}
