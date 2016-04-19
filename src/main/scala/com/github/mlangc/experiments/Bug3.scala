package com.github.mlangc.experiments

object Bug3 {
  trait SomeTypeClass[T]
  def someFuncUsingTypeClass[T : SomeTypeClass](t: T) = ???

  object BasicTypeClasses {
    implicit val typeClassForString = new SomeTypeClass[String] { }
    implicit def typeClassForOption[T : SomeTypeClass] = new SomeTypeClass[Option[T]] { }
  }

  case class SomeCaseClass(s: String)

  object SomeCaseClass {
    import BasicTypeClasses._

    private def mkTypeClass(implicit tc: SomeTypeClass[String]) = new SomeTypeClass[SomeCaseClass] { }

    implicit val typeClassForSomeCaseClass = mkTypeClass
  }
}
