ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / javaOptions ++= Seq("--enable-preview")

ThisBuild / javacOptions ++= Seq("--enable-preview", "--release", "19")

libraryDependencies ++= Seq(
  "com.tethys-json" %% "tethys-core" % "0.26.0",
  "com.tethys-json" %% "tethys-jackson" % "0.26.0",
  "com.tethys-json" %% "tethys-derivation" % "0.26.0",
  "commons-codec" % "commons-codec" % "1.15",
  "org.scalatest" %% "scalatest" % "3.2.14" % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "ffs",
 //    idePackagePrefix := Some("org.acef304.ffs")
  )
