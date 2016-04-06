package com.github.mlangc.experiments

class Bug {
  def test = {
    val tryRenameMe = 1
    val x = f"$tryRenameMe"
    x
  }
}
