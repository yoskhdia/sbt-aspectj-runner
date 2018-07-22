addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.13")

sys.props.get("plugin.version") match {
  case Some(x) => addSbtPlugin("io.kamon" % "sbt-aspectj-runner-play-2.6" % x)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}
