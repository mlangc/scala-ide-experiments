package com.github.mlangc.experiments

case class Bug6(i: Int = 1, j: Int = 2) {
  def /*(*/buggy/*)*/ = copy(j = /*i*/0, i = /*j*/1)
}
