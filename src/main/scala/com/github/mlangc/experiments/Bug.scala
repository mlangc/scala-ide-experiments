package com.github.mlangc.experiments

class Bug {
  val withStructuralTpe = {
    new AnyRef {
      def tryRenameMe = 42
    }
  }

  withStructuralTpe.tryRenameMe
}
