

name := "customized-csr-toolbox"

PlayKeys.devSettings += "play.http.router" -> "custom.Routes"

lazy val customized = (project in file("customized"))
  .enablePlugins(PlayScala)
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

