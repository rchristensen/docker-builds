resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com"

addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.8.0")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.9")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.1.0")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.6.0")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
