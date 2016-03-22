package com.github.mlangc.experiments

class BugWithTypeclasses {
  import com.github.mlangc.experiments.typeclasses.SomeTypeclass
  import com.github.mlangc.experiments.typeclasses.SomeTypeclass.Implicits._

  def methodThatNeedsTypeclass[T : SomeTypeclass](t: T) = ???

  methodThatNeedsTypeclass("s")
  methodThatNeedsTypeclass(3)
  methodThatNeedsTypeclass(None: Option[Int])
}
