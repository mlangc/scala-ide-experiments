package com.github.mlangc.experiments

object RenameBug2 {
  final val TryRenameMe = 42

  @AnAnnotation(value3 = TryRenameMe)
  class SomeClass
}
