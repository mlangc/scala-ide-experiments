package com.github.mlangc.experiments

trait RenameMe {
  def works1: Map[Int, RenameMe]
  def works2: Map[Int, /**/RenameMe]
  def works3: Map[/**/ Int/**/, /**/RenameMe /**/ ]

  def breaksFormat1: Map[Int,RenameMe]

  def breaksCompile1: Map[Int,/**/RenameMe]
  def breaksCompile2: Map[Int,/**/ RenameMe]

  def breaksCompile3: Map[Int,/**/
    RenameMe]
}
