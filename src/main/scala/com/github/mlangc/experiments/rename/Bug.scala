package com.github.mlangc.experiments.rename

class Bug {
  val kerl1 = {
    new me.Lausbub
  }
  
  val kerl2: me.Kerl = {
    ???
  }
  
  val kerl3 = {
    import me.Lausbub
    new Lausbub
  }
}