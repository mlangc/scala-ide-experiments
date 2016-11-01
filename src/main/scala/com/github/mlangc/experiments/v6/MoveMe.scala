package com.github.mlangc.experiments.v6

import com.github.mlangc.experiments.v6.move.me.here.{DepInTargetPackage1, DepInTargetPackage2, DepInTargetPackage3 => Dep3}
import com.github.mlangc.experiments.v6.move.me.here.{DepInTargetPackage3 => Dep3}

class MoveMe {
  val tDep1 = new DepInTargetPackage1
  val tDep2 = new DepInTargetPackage2
  val tDep3 = new Dep3
}