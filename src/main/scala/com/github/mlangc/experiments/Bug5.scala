package com.github.mlangc.experiments

import scala.language.implicitConversions

trait Bug5 {
  implicit def intToString(i: Int) = i.toString
}
