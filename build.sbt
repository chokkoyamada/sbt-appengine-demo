name := "sbt-appengine-demo"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.json4s" % "json4s-jackson_2.13.0-M2" % "3.5.3"
)
