lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    version := "0.1",
    scalaVersion := "2.11.12",
    PlayKeys.playInteractionMode := play.sbt.StaticPlayNonBlockingInteractionMode,
    fork in run := false
  )
