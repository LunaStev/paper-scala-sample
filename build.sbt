// build sbt
val scalaVer = "3.3.4"
val projectVersion = "0.1.0-SNAPSHOT"
val paperVersion = "1.20.2-R0.1-SNAPSHOT"
val projectName = "paper-sample"

// Package
val baseOrganization = "io.github.lunastev"
val idePackagePrefixBase = "sample.plugin"
val mainPackage = baseOrganization + "." + idePackagePrefixBase

ThisBuild / scalaVersion := scalaVer
ThisBuild / version := projectVersion

lazy val root = (project in file("."))
  .settings(
      name := projectName,
      organization := baseOrganization,
      idePackagePrefix := Some(s"$mainPackage"),
      resolvers += "PaperMC Repository" at "https://repo.papermc.io/repository/maven-public/",
      libraryDependencies += "io.papermc.paper" % "paper-api" % paperVersion,
  )
