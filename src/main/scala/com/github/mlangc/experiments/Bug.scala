package com.github.mlangc.experiments

class Bug {
  def f(x: Int) = x
  def g(a: Int, b: Int) = f(x = a) + b
}
