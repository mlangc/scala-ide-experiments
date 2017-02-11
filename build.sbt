organization := "com.github.mlangc"

name := "scala-ide-experiments"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-encoding", "utf8", "-target:jvm-1.8", "-optimise")

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.3"

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource


