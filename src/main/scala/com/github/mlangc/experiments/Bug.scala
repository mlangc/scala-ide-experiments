package com.github.mlangc.experiments

case class Bug(i: Int = 1, j: Int = 2) {
  def buggy = copy(j = i)
}
