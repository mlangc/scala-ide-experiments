package com.github.mlangc.experiments

import com.github.mlangc.experiments.src.pkg.MoveMe

class Bug {
  val noTrap = new MoveMe

  import com.github.mlangc.experiments.trap.MoveMe
  val trap = new MoveMe
}
