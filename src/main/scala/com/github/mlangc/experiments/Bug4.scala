package com.github.mlangc.experiments

case class Bug4(i: Int = 1, j: Int = 2, `i!`: Int = 3, `j!`: Int = 4) {
  def /*(*/buggy/*)*/ = copy(j = `i!`, i = `j!`)
}
