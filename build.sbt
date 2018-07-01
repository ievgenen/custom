import sbt._

name := "customized-csr-toolbox"

lazy val customized = (project in file("customized"))
    .settings(
        scalaVersion := "2.11.12",
                scalacOptions in ThisBuild := Seq("-feature",
            "-language:postfixOps",
            "-language:implicitConversions",
            "-unchecked",
            "-deprecation",
            "-encoding",
            "utf8"),
        name := "customized-csr-toolbox-impl"
    )

