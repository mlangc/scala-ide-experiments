package com.github.mlangc.experiments

trait Bug {
  def renameMe: Seq[Kaefer]
}

class Buggy extends Bug {
  override def renameMe: Seq[Kaefer] = {
    ???
  }
}

object Kaefer {

}

class Kaefer {

}
