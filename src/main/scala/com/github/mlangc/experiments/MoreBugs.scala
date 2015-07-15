package com.github.mlangc.experiments

trait MoreBugs {
  protected def renameMe: Int
}

class Kaefer extends MoreBugs {
  override lazy val renameMe = 1
}

class Mistkaefer extends MoreBugs {
  protected override lazy val renameMe = 1
}

class Kartoffelkaefer extends MoreBugs {
  override protected lazy val renameMe = 1
}

class Marienkaefer extends MoreBugs {
  override lazy protected val renameMe = 1
}
