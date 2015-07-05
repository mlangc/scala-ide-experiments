package com.github.mlangc.experiments

class Bug {
  def f(x: Int, y: Int) = x
  def g(a: Int, b: Int) = f(y = b, x = a)
}
