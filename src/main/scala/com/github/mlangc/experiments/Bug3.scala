package com.github.mlangc.experiments

trait Bug3 { renameMe =>
  trait Inner1 { renameMe =>
    def evil = {
      trait Bug3 { renameMe =>
        def alias1 = renameMe
        def alias2 = alias1
        def alias3 = this
      }
      42
    }
    
    def alias = renameMe
  }
  val alias = renameMe
}