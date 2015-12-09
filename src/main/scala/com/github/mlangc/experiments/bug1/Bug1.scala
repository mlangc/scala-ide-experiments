package com.github.mlangc.experiments.bug1

object X extends App {
  O() /*Please*/ . /*let me survive!*/ /*(*/renameMe/*)*/meth()
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
