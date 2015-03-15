package com.github.mlangc.experiments

object TryRenameOnApply {
  class RenameMe
  object RenameMe {
    def apply() = new RenameMe
  }

  /*
   * Renaming below will attempt to rename "apply" and not the class/object "RenameMe"
   */
  RenameMe()
}
