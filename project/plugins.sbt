addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

// ls.implicit.ly
addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.1")

resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  Opts.resolver.sonatypeReleases
)
