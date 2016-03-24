package com.github.mlangc.experiments

trait SomeTypeClass[T]

object SomeTypeClass {
  def doSomething[T : SomeTypeClass](t: T) = ???
}

case class SomeCaseClass(s: String)
case class SomeGenericCaseClass[T](t: T)

object SomeGenericCaseClass {
  implicit def someTypeClassForSomeGenericCaseClassImpl[T : SomeTypeClass] = new SomeTypeClass[SomeGenericCaseClass[T]] { }
}

object SomeCaseClass {
  implicit val someTypeClassForSomeCaseClassImpl = new SomeTypeClass[SomeCaseClass] { }
}

object SomeTypeClassImpls {
  implicit val forInt = new SomeTypeClass[Int] { }
  implicit val forString = new SomeTypeClass[String] { }
}

object Bug {
  import SomeTypeClassImpls._

  val x = SomeTypeClass.doSomething(SomeCaseClass("test"))
  val y = SomeTypeClass.doSomething(SomeGenericCaseClass(1))
}
