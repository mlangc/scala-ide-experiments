package com.github.mlangc.experiments

case class Bug9(i: Int, j: Int) {
  def /*(*/notBuggy/*)*/ = copy(j = {
    val i = 3
    i
  })
}