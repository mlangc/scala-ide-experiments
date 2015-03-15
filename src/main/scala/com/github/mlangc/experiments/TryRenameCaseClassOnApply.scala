package com.github.mlangc.experiments

object TryRenameCaseClassOnApply {
  case class RenameMe(i: Int)

  /*
   * Renaming below will attempt to rename "apply" and not the case class "RenameMe"
   */
  RenameMe(88)
}
