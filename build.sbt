organization := "com.github.mlangc"

name := "scala-ide-experiments"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions := Seq("-encoding", "utf8")

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
