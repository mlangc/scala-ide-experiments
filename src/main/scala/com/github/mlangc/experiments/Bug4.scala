package com.github.mlangc.experiments

object Bug4 {
  class `€€€` {
    def x = 42
  }

  class DollarDollarDollar {
    def y = 53
  }
}

class Bug4 {
  import Bug4.`€€€`
  import Bug4.{DollarDollarDollar => `$$$`}

  new `€€€`().x
  new `$$$`().y
}