import com.typesafe.sbt.web.SbtWeb.autoImport._
import com.typesafe.sbt.less.Import.LessKeys
import WebKeys._
import com.typesafe.sbt.web.Import.WebKeys.public
import com.typesafe.sbt.web.pipeline.Pipeline
import com.typesafe.sbt.web.PathMapping
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerHelper._

name := """sample"""

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.7"

organization := "com.jaroop"

libraryDependencies ++= Seq(
    jdbc,
    anorm,
    cache,
    ws,
    "mysql" % "mysql-connector-java" % "5.1.25",
    "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.1",
    "jp.t2v" %% "stackable-controller" % "0.4.1",
    "jp.t2v" %% "play2-auth"      % "0.13.0",
    "jp.t2v" %% "play2-auth-test" % "0.13.0" % "test",
    "org.mindrot"  % "jbcrypt"   % "0.3m",
    "org.jsoup" %  "jsoup" % "1.7.2",
    "org.seleniumhq.selenium" % "selenium-java" % "2.39.0" % "test",
    "org.fluentlenium" % "fluentlenium-festassert" % "0.9.2" % "test" exclude("org.jboss.netty", "netty"),
    "com.github.mumoshu" %% "play2-memcached" % "0.6.0",
    "joda-time"         % "joda-time"           % "2.1",
    "net.sf.uadetector" % "uadetector-resources" % "2014.05",
    "org.scalaz" %% "scalaz-core" % "7.0.6",
    "com.jaroop" %% "anorm-relational" % "0.1.0",
    "com.github.sstone" %% "amqp-client" % "1.4",
    "nl.rhinofly" %% "play-s3" % "5.0.2",
    "com.amazonaws" % "aws-java-sdk" % "1.7.1",
    "org.webjars" %% "webjars-play" % "2.3.0-2",
    "org.webjars" % "bootstrap" % "3.2.0",
    "org.webjars" % "modernizr" % "2.6.2",
    "org.webjars" % "jquery" % "1.11.1",
    "org.webjars" % "jquery-ui" % "1.10.3",
    "org.webjars" % "jquery-migrate" % "1.2.1",
    "org.webjars" % "underscorejs" % "1.7.0",
    "org.webjars" % "backbone-relational" % "0.8.8",
    "org.webjars" % "bootbox" % "4.3.0",
    "org.webjars" % "retinajs" % "0.0.2",
    "org.webjars" % "dropzone" % "3.11.1"
)

resolvers += "Spy Repository" at "http://files.couchbase.com/maven2"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

resolvers += "Rhinofly Internal Repository" at "http://maven-repository.rhinofly.net:8081/artifactory/libs-release-local"
