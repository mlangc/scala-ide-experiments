package com.github.mlangc.experiments

import java.util.Arrays
import java.util.Collections

class Bug5 {
  import java.util.Collections

  def test1 = Arrays.asList(1, 2)
  def test2 = Collections.emptyList
}
