package com.github.mlangc.experiments

import test.MyType

package object test {
  type MyType = Set[String]
}

object Bug {
  val x: MyType =  Set("a")
}
