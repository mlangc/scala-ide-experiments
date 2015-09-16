package com.github.mlangc.experiments

case class Bug2(s1: String = "", s2: String = "") {
  def buggy = copy(s2 = "x", s1 = "y")
}
