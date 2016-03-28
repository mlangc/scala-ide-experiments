package com.github.mlangc.experiments

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

@AnAnnotation(value1 = classOf[TryRenameMe], value2 = classOf[OrTryRenameMe], value3 = Constants.OrTryRenameMe)
class Bug
