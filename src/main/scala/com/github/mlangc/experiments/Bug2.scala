
package com.github.mlangc.experiments

object Bug2 {
  lazy val l1 = mkVal(1)
  lazy val l2 = mkVal(2)
  lazy val tryRenameMe = mkVal(3)

  def mkVal(i: Int) = i
}
