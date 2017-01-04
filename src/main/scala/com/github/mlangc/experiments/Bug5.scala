package com.github.mlangc.experiments

package outer {
  package inner {
    trait Space
  }
}

import outer.inner.Space

trait Bug5 { this: Space/*<-cursor-2*/ =>

}
