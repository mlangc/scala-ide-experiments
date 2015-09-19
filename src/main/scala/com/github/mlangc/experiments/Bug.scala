package com.github.mlangc.experiments

trait T {
  def f: Int
}
trait TT extends T {
  def f = (1)
}
