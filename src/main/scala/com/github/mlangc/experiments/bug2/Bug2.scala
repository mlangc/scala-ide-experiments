package com.github.mlangc.experiments.bug2

object X extends App {
  O()./**/test/**/ /*Please don't forget about me!!!!*/ /*(*/.renameMe/*)*/()
}

class C {
  def renameMe(j: Int = 0) = j
}

class O {
  def test: C = ???
}

object O {
  def apply(): O = ???
}
