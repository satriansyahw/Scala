name := """HelloWorld"""
organization := "com.scalaLearn"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.10"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.12"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.scalaLearn.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.scalaLearn.binders._"
