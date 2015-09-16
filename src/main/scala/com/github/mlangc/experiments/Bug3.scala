package com.github.mlangc.experiments

case class Bug3(s1: String = "", s2: String = "", ss1: String = "", ss2: String = "") {
  def /*(*/buggy/*)*/ = copy(s2 = ss1, s1 = ss2)
}
