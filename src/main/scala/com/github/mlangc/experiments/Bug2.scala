package com.github.mlangc.experiments

import scala.language.implicitConversions
import java.util.concurrent.atomic.AtomicBoolean
import java.util.{concurrent => javaConcurrent}
import scala.{concurrent => scalaConcurrent}

object Bug2 {
  implicit def tryOrganizeImportsHere[T](scalaFuture: scalaConcurrent.Future[T]): javaConcurrent.Future[T] = ???
}
