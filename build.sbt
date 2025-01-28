ThisBuild / scalaVersion := "3.3.4"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "paper-sample",
    idePackagePrefix := Some("io.github.lunastev.sample.plugin"),
    organization := "io.github.lunastev",
    resolvers += "PaperMC Repository" at "https://repo.papermc.io/repository/maven-public/",
    libraryDependencies += "io.papermc.paper" % "paper-api" % "1.20.2-R0.1-SNAPSHOT"
  )
