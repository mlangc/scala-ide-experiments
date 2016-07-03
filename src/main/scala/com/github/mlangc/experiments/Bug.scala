package com.github.mlangc.experiments

class Bug {
  val a = 1 + 2 + 3
  val b = 1 :: 2 :: 3 :: Nil
  val c = Seq(1) ++ Seq(2) ++ Seq(3)
  val d = 1 +: 2 +: 3 +: Seq()
  val e = 1.0 + 2.0 + 3.0
  val f = "1" + "2" + "3"
  
  val g = someList match {
    case x :: xs => x
    case _ => Nil
  }
  
  def someList: List[Int] = 1 :: 2 :: 3 :: Nil
}
