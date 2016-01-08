package com.github.mlangc.experiments

import java.util._
import java.util.concurrent._
import java.util.concurrent.atomic._

trait Bug {
  def tryOrganizeImportsHere: AtomicLong
}
