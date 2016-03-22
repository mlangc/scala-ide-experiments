package com.github.mlangc.experiments.typeclasses

trait SomeTypeclass[T] {

}

object SomeTypeclass {
  def mkTypeclassFor[T] = new SomeTypeclass[T] { }

  object Implicits {
    implicit val stringTypeclass = SomeTypeclass.mkTypeclassFor[String]
    implicit val intTypeclass = SomeTypeclass.mkTypeclassFor[Int]
    implicit def optionTypeclass[T](implicit tc: SomeTypeclass[T]): SomeTypeclass[Option[T]] = SomeTypeclass.mkTypeclassFor[Option[T]]
  }
}
