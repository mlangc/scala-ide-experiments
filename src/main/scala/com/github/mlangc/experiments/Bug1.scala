package com.github.mlangc.experiments

case class Bug1(i: Int = 1, j: Int = 2) {
  def buggy = copy(j = i)
}

