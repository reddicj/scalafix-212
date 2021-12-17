name := "scalafix-212"
organization := "my.app"

scalaVersion := "2.12.15"
// scalaVersion := "2.13.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Ywarn-adapted-args",
  "-Ywarn-unused"
)

ThisBuild / scalafixDependencies ++= List(
  // "com.github.liancheng" %% "organize-imports" % "0.5.0",
  "org.scala-lang.modules" %% "scala-collection-migrations" % "2.6.0"
)

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision
// ThisBuild / scalafixScalaBinaryVersion := "2.12"
addCompilerPlugin(scalafixSemanticdb)
scalacOptions ++= List("-Yrangepos", "-P:semanticdb:synthetics:on")