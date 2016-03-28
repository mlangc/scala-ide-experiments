package com.github.mlangc.experiments

object SomeTypes {
  class InnerClazz
}

class Bug {
  val ic: InnerClazz = ???
}
