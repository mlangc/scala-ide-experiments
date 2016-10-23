package com.github.mlangc.experiments.v5

import com.github.mlangc.experiments.v5.move.me.here.{DepInTargetPackage1, DepInTargetPackage2}

class MoveMe {
  val tDep1 = new DepInTargetPackage1
  val tDep2 = new DepInTargetPackage2
}