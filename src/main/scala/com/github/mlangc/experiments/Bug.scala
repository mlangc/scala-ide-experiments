package com.github.mlangc.experiments

abstract class Bug {
  def renameMe: Int
}

class Buggy extends Bug {
  lazy val renameMe = 99
}
