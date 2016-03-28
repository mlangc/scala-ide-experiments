package com.github.mlangc.experiments

import org.junit.runner.RunWith

import org.scalatest.junit.JUnitRunner
import com.github.mlangc.experiments.test._

/*
 * Try renaming or organizing imports here
 */
package test {
  class TryRenameMe
  class OrTryRenameMe

  object Constants {
    final val OrTryRenameMe = 42
  }
}

@RunWith(classOf[JUnitRunner])
@AnAnnotation(value1 = classOf[TryRenameMe], value2 = classOf[OrTryRenameMe], value3 = Constants.OrTryRenameMe)
class Bug
