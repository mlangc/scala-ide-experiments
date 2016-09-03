package com.github.mlangc.experiments

import com.github.mlangc.experiments.move.me.here.DepInTargetPackage

class Bug {
  val dep1 = new DepInTargetPackage
  val dep2 = new DepInSourcePackage
}
