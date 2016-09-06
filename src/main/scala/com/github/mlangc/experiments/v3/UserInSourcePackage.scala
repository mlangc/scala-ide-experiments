package com.github.mlangc.experiments.v3

import com.github.mlangc.experiments.v3.move.me.here._

class UserInSourcePackage {
  val usr = new MoveMe
  val (u1, u2) = (new UnrelatedClassInSourcePackage, new UnrelatedClassInTargetPackage)
}
