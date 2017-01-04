package com.github.mlangc.experiments

package outer {
  package inner {
    trait Clazz
  }
}

import outer.inner

trait Bug6 { this: /*cursor->*/inner.Clazz =>

}
