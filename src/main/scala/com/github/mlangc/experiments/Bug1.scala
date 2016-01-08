package com.github.mlangc.experiments

import java.util.{concurrent => javaConcurrent}
import scala.{concurrent => scalaConcurrent}

trait Bug1 {
  def tryOrganizeImportsHere(x: javaConcurrent.atomic.AtomicBoolean): scalaConcurrent.Future[Unit]
}
