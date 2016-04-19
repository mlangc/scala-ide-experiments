package com.github.mlangc.experiments

object `Eye[` {
  object `.Of` {
    object Sauron
    object TheBeholder
  }

}


class Bug1 {
  import `Eye[`.`.Of`.TheBeholder
  import `Eye[`.`.Of`.Sauron

  val x = Sauron
}
