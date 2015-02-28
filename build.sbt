organization := "com.typesafe.training"

name := "scala-train"

version := "3.0.0"

scalaVersion := Version.scala

libraryDependencies ++= Dependencies.scalaTrain :+ "org.scalatest" %% "scalatest" % "2.0.M6-SNAP26" % "test"

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

initialCommands in console := "import com.typesafe.training.scalatrain._"

//initialCommands in (Test, console) := (initialCommands in console).value + ",TestData._"
