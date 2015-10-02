package com.github.mlangc.experiments

trait Bug1 {
  def renameMe: Seq[Bug1]
}

trait Bug2 {
  def renameMe: Map[Int, Int]
}

trait Bug3 {
  def renameMe: Seq[/**/Int]
}

trait Bug4 {
  def renameMe: Seq[Int ]
}

trait Bug5 {
  def renameMe: Map[/***/
    Int, String ]
}

trait Bug6 {
  val renameMe: Map[Bug1, Int]
}