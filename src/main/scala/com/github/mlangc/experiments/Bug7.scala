package com.github.mlangc.experiments

case class Bug7(i: Int = 1, j: Int = 2) {
  private val `i=3` = 666
  def /*(*/buggy/*)*/ = copy(j = /*i*/`i=3`, i = /*j*/1)
}
