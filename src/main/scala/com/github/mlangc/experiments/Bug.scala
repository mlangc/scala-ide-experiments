package com.github.mlangc.experiments

import _root_.scala.collection.immutable.BitSet
import refactoring.test.scala.SomeObject

package scala {
  object SomeObject
}

object Bug {
  Vector(SomeObject)
  BitSet(0)
}
