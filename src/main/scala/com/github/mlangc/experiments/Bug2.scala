package com.github.mlangc.experiments

object Bug2 {
  class Class {
    def renameMe(i: Int = 42) = i
  }

  val c = new Class
  c.renameMe()
}
