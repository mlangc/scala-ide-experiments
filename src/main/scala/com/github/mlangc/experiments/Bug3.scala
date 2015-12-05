package com.github.mlangc.experiments

object X3 {
  O3().test.meth(0)
}

class C3 {
  def meth(i: Int = 0, j: Int = 1) = i + j
}

class O3 {
  def test: C3 = ???
}

object O3 {
  def apply(): O3 = ???
}
