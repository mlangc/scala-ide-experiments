package com.github.mlangc.experiments

import com.github.mlangc.experiments.v1.src.pkg.MoveMe

class Bug {
  val unqualified = new MoveMe
  val fullyQualified = new com.github.mlangc.experiments.v1.src.pkg.MoveMe
}
