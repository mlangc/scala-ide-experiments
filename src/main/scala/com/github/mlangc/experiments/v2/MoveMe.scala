package com.github.mlangc.experiments.v2

import com.github.mlangc.experiments.v2.move.me.here.DepInTargetPackage

class MoveMe {
  val depSource = new DepInSourcePackage
  val depTarget = new DepInTargetPackage
}