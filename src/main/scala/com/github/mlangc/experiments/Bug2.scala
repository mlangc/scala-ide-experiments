package com.github.mlangc.experiments

case class SomeCaseClass(x: Int)


object BasicJsonFormats {
  import play.api.libs.json._

  implicit val someClassJsonFormat = Json.format[SomeCaseClass]
}

case class Bug2(x: SomeCaseClass)

object Bug2 {
  import BasicJsonFormats._
  import play.api.libs.json._

  implicit val bug2JsonFormat = Json.format[Bug2]
}
