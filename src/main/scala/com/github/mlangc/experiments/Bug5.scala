package com.github.mlangc.experiments

import scala.collection.JavaConversions.asJavaEnumeration
import scala.collection.JavaConversions.enumerationAsScalaIterator

object Bug5 {

  val enumeration = asJavaEnumeration(Seq(1, 2, 3).toIterator)

  for (elem <- enumeration) {
    println(elem)
  }
}
