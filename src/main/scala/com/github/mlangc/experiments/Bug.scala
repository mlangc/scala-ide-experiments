package com.github.mlangc.experiments

import _root_.scala.collection.immutable.BitSet
import com.github.mlangc.experiments.scala.SomeObject

package scala {
  object SomeObject
}

object Bug {
  Vector(SomeObject)
  BitSet(0)
}
