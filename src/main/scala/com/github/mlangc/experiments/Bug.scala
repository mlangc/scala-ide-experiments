package com.github.mlangc.experiments

import org.junit.runner.RunWith

import org.scalatest.junit.JUnitRunner
import com.github.mlangc.experiments.test._

package test {
  class Foo
  class Bar
}

@RunWith(classOf[JUnitRunner])
@AnAnnotation(value1 = classOf[Foo], value2 = classOf[Bar])
class Bug
