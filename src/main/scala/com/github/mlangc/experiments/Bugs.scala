package com.github.mlangc.experiments

class Bug1 {
  val tryRenameMeHereOrInMethod = 0

  def f = {
    val tryRenameMeHereOrInMethod = 0
    println(tryRenameMeHereOrInMethod)
    this
  }
}

class Bug2 {
  val tryRenameMeInMethod = 0

  def f = {
    val tryRenameMeInMethod = 0
    println(tryRenameMeInMethod)
  }
}
