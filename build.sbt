organization := "com.github.mlangc"

name := "scala-ide-experiments"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-encoding", "utf8", "-target:jvm-1.8")

libraryDependencies += "junit" % "junit" % "4.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
