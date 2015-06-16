package com.github.mlangc.experiments

trait Bug {
  protected def x: Int
}

class Buggy extends Bug {
  protected override def x = 9
}
