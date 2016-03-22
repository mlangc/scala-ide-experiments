package com.github.mlangc.experiments

object Bug7 {
  object ` => ` {
    val x = 42
  }
}

class Bug7 {
  import Bug7.` => `
  val x = ` => `.x
}