package com.github.mlangc.experiments

package bugs {
  sealed trait MyList[+T]
  case class ::[T](head: T, tail: MyList[T]) extends MyList[T]
  case object MyNil extends MyList[Nothing]
}

class Bug6 {
  def f1 = {
    import bugs.::
    import bugs.MyList
    import bugs.MyNil

    new ::(1, MyNil)
  }
}