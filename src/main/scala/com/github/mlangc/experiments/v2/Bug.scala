package com.github.mlangc.experiments.v2

object Bug {
  def foo = {
    import com.github.mlangc.experiments.v2.src.pkg.MoveMe
    new MoveMe
  }
}
