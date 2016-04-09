package com.github.mlangc.experiments

object RenameBug1 {
  class TryRenameMe

  @AnAnnotation(value1 = classOf[TryRenameMe])
  class SomeClass
}
