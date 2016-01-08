package com.github.mlangc.experiments

import java.util.concurrent.atomic.{AtomicBoolean => Aboolean, AtomicInteger => Aint, AtomicLong => Along}

trait Bug4 {
  def tryOrganizeImportsHere(b: Aboolean, i: Aint, l: Along): Double
}
