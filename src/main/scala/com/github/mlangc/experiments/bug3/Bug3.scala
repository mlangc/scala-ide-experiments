package com.github.mlangc.experiments.bug3

object X extends App {
  O(). /*let me survive!*/ /*(*/renameMe/*)*/meth()
}

class C {
  def meth(j: Int = 0) = j
}

class O {
  def renameMe: C = ???
}

object O {
  def apply(): O = ???
}
