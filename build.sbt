name := "ScalaIsAwesome"

version := "1.0.0"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9" % "test"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "org.specs2" % "specs2_2.10" % "1.14" % "test"

seq(ScctPlugin.instrumentSettings : _*)

