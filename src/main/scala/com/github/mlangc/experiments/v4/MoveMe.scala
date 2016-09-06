package com.github.mlangc.experiments.v4

import com.github.mlangc.experiments.v4.{DepInSourcePackage => Sdep}
import com.github.mlangc.experiments.v4.move.me.here.{DepInTargetPackage => Tdep}

class MoveMe {
  val sDep = new Sdep
  val tDep = new Tdep
}