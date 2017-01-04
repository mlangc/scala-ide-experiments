package com.github.mlangc.experiments

package outer {
  package space {
    trait Inner
  }
}

import outer._

trait Bug4 { this: space.Inner/*<-cursor-2*/ =>

}
