package com.github.mlangc.experiments

import scala.language.implicitConversions
import scala.concurrent.{Future => ScalaFuture}
import java.util.concurrent.{Future => JavaFuture}
import java.util.concurrent.atomic.AtomicBoolean

trait Bug3 {
  implicit def tryOrganizeImportsHere[T](javaFuture: JavaFuture[T]): ScalaFuture[T]
}
