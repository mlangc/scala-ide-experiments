package com.github.mlangc.experiments

object X extends App {
  O().test.meth()
}

class C {
  def meth(j: Int = 0) = j
}

class O {
  def test: C = ???
}

object O {
  def apply(): O = ???
}
