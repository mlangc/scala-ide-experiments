package com.github.mlangc.experiments

object Bug {
  sealed trait Expr 
  case class Var(name: String) extends Expr
  case class Lambda(arg: Var, body: Expr) extends Expr
  case class Apply(fun: Expr, arg: Expr) extends Expr 
}
