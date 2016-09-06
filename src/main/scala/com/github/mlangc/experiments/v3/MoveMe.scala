package com.github.mlangc.experiments.v3

import com.github.mlangc.experiments.v3.move.me.here.DepInTargetPackage

class MoveMe {
  val depSource = new DepInSourcePackage
  val depTarget = new DepInTargetPackage
}
