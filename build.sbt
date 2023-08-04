lazy val munitSnapshot = (project in file("./munit-snapshot"))
  .settings(
    name := "munit-snapshot",
    organization  := "com.github.lolgab",
    scalaVersion := "2.13.11",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0-M7",
      "com.lihaoyi" %% "upickle" % "3.1.0",
      "com.lihaoyi" %% "os-lib" % "0.9.1",
    ),
    Compile / unmanagedSourceDirectories += baseDirectory.value / "src",
    Test / unmanagedSourceDirectories += baseDirectory.value / "test" / "src",
  )
