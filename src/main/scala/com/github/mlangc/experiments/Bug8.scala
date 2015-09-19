package com.github.mlangc.experiments

case class Bug8(`i=j`: Int = 667, `i`: Int = 23) {
  def /*(*/buggy/*)*/ = copy(`i=j`=666,`i`=1)
  }