ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaMysql"
  )

libraryDependencies += "com.mysql" % "mysql-connector-j" % "8.1.0"