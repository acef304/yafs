ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / javaOptions ++= Seq("--enable-preview")

ThisBuild / javacOptions ++= Seq("--enable-preview", "--release", "19")

lazy val root = (project in file("."))
  .settings(
    name := "ffs",
//    idePackagePrefix := Some("org.acef304.ffs")
  )
