package com.github.mlangc.experiments

class Bug

class Buggy {
  lazy val bug: Bug = new Bug

  def moreBugs = {
    lazy val buggy: Bug = new Bug
    val notBuggy: Bug = new Bug
    buggy.hashCode + notBuggy.hashCode
  }
}
