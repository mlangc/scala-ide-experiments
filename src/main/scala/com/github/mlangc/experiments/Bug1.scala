package com.github.mlangc.experiments

import java.util.Collections

class Bug1 {
  import Collections.emptyList

  def test = emptyList
}
