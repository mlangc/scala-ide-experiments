organization := "com.github.mlangc"

name := "scala-ide-experiments"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-encoding", "utf8", "-target:jvm-1.8")

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

libraryDependencies += "org.specs2" %% "specs2" % "2.3.12"
