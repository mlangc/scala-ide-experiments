package com.github.mlangc.experiments.v3.move.me.here

import com.github.mlangc.experiments.v3.{UnrelatedClassInSourcePackage, MoveMe}

class UserInTargetPackage {
  val usr = new MoveMe
  val (u1, u2) = (new UnrelatedClassInSourcePackage, new UnrelatedClassInTargetPackage)
}
