package com.github.mlangc.experiments

trait ImplicitVals {
  implicit def x = 42
}

object Bug {
  class Ret(x: Int) {
    def withDefault(a: String = "") = a + x
  }

  def apply()(implicit x: Int) = {
    new Ret(x)
  }
}

class Bug extends ImplicitVals {
  val tryRenameMe = Bug().withDefault()
}
