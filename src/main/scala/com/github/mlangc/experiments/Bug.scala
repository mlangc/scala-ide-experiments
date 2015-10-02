package com.github.mlangc.experiments

trait Bug1 {
  def renameMe: Bug1
}

trait Bug2 {
  def renameMe: Map[Int, Int]
}
