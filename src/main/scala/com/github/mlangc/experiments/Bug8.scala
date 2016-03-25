package com.github.mlangc.experiments

class Bug8 {
  import scala.language.implicitConversions
  implicit def intToString(i: Int) = i.toString
}