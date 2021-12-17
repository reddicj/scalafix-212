name := "scalafix-212"
organization := "my.app"

scalaVersion := "2.12.15"
// scalaVersion := "2.13.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Ywarn-unused"
)

ThisBuild / scalafixDependencies ++= List(
  "org.scala-lang.modules" %% "scala-collection-migrations" % "2.6.0"
)

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision
addCompilerPlugin(scalafixSemanticdb)
scalacOptions ++= List("-Yrangepos", "-P:semanticdb:synthetics:on")