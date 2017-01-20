package com.github.mlangc.experiments.rename

object Holder {
  trait A
  trait B
  trait C
  trait D
  trait E

  trait T { this: A with (B with (C with D with E)) =>

  }
}

trait A
trait B
trait C
trait D
trait E

trait T { this: A with (B with (C with D with E)) =>

}
