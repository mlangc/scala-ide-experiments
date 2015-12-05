package com.github.mlangc.experiments

class Bug4 {
  class C4 {
    def foo(i: Int = 1): Int = i
  }
  def renameMe = new C4
}

object Bug4 {
  def test() = new Bug4

  test().renameMe.foo()
}
