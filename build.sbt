name := "ScalaIsAwesome"

version := "1.0.0"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M6-SNAP9" % "test"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "2.1.1" % "test"

ScctPlugin.instrumentSettings

