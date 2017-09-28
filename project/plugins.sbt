logLevel := Level.Warn

lazy val root = project.in(file(".")).dependsOn(githubRepo)

lazy val githubRepo = uri("git://github.com/sbt/sbt-appengine#37f92e524dbe0c94b103378fc1d183d0fefc7158")

addSbtPlugin("com.eed3si9n" % "sbt-appengine" % "0.7.1-SNAPSHOT")
