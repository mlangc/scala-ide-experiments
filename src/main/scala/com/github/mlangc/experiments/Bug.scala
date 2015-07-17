package com.github.mlangc.experiments

import com.github.mlangc.experiments.test._

package test {
  class Test
}

class Bug {
  None.getOrElse {
    val x: Test = ???
    x
  }
}
