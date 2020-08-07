val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.1.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
addSbtPlugin("com.codecommit" % "sbt-spiewak-sonatype" % "0.14.0")
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.8.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.19")

