name := """donestore"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

val PhantomVersion = "1.12.2"

libraryDependencies ++= Seq(
  "com.websudos" %% "phantom-dsl" % PhantomVersion,
  "com.websudos" %% "phantom-testkit" % PhantomVersion % "test, provided",
  specs2 % Test
)

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  Resolver.bintrayRepo("websudos", "oss-releases")
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
