// For sbt-appengine to work, you must set the APPENGINE_SDK_HOME environment variable

// jetty is required by sbt-appengine
libraryDependencies += "org.eclipse.jetty" % "jetty-server" % "9.2.15.v20160210" % "container"

// enables sbt-appengine commands like ~appengineDevServer and appengineDeploy
appengineSettings