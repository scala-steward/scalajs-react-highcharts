addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.1.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.18.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")

addSbtPlugin("edu.gemini" % "sbt-gsp" % "0.2.3")

resolvers += Resolver.bintrayRepo("oyvindberg", "converter")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta18")