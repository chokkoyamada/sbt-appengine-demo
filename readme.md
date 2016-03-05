## Description

This sample application is a Scala conversion of the Google App Engine hello world app.


## Motivation

The goal of this sample application is to provide a template for a Scala web application which can be easily deployed to Google App Engine using sbt.


## Google App Engine basics

  * Set application name and version number in appengine-web.xml
  * Route requests to servlets in web.xml
  * Deployment takes about 30 seconds
  * The initial deployment will open a web browser requiring you to login and create an OAuth token
  * Deploying current version replaces the running app immediately
  * Deploying a new version does not automatically deploy an instance - you must visit the console and select "Migrate Traffic" or "Route All Traffic" to begin using the new version specified in appengine-web.xml
  * If you shutdown all instances of a Dynamic availability application, an instance will be created automatically upon request
  * To prevent automatic instance creation, visit settings and select "Disable application"
  * Deployment takes about 30 seconds
  * Deployment takes about 30 seconds


## Setup
Set the APPENGINE_SDK_HOME environment variable to the path of the Google App Engine Java SDK


## Example: Deploy application to Google App Engine

```
$ sbt appengineDeploy
[info] Loading project definition from sbt-appengine-demo/project
[info] Set current project to sbt-appengine-demo (in build file:sbt-appengine-demo)
[info] Compiling 1 Scala source to sbt-appengine-demo/target/scala-2.11/classes...
[info] Packaging sbt-appengine-demo_2.11-0.1.war ...
[info] Done packaging.
Reading application configuration data...
2016-03-05 11:54:43.060:INFO::Logging to STDERR via org.mortbay.log.StdErrLog


Beginning interaction for module default...
0% Created staging directory at: 'appcfg.tmp'
5% Scanning for jsp files.
20% Scanning files on local disk.
25% Initiating update.
28% Cloning 1 static files.
31% Cloning 16 application files.
40% Uploading 1 files.
52% Uploaded 1 files.
61% Initializing precompilation...
68% Sending batch containing 1 file(s) totaling 1KB.
90% Deploying new version.
95% Closing update: new version is ready to start serving.
98% Uploading index definitions.

Update for module default completed successfully.
Success.
Cleaning up temporary files for module default...
[info]
[success] Total time: 27 s, completed Mar 5, 2016 11:54:59 AM
```


## Example: Deploy local development server with continuous compilation

```
$ sbt ~appengineDevServer
[info] Loading project definition from sbt-appengine-demo\project
[info] Set current project to sbt-appengine-demo (in build file:sbt-appengine-demo/)
[info] Updating {file:sbt-appengine-demo/}sbt-appengine-demo...
[info] Resolving org.eclipse.jetty#jetty-io;9.2.15.v20160210 ...
[info] Done updating.
[info] Packaging sbt-appengine-demo/target/scala-2.11/sbt-appengine-demo_2.11-0.1.war ...
[info] Done packaging.
[info] Starting dev server in the background ...
[success] Total time: 3 s, completed Mar 5, 2016 11:42:40 AM
1. Waiting for source changes... (press enter to interrupt)
Listening for transport dt_socket at address: 1044
2016-03-05 11:42:46.952:INFO::Logging to STDERR via org.mortbay.log.StdErrLog
Mar 05, 2016 11:42:47 AM com.google.apphosting.utils.jetty.JettyLogger info
INFO: Logging to JettyLogger(null) via com.google.apphosting.utils.jetty.JettyLogger
Mar 05, 2016 11:42:47 AM com.google.apphosting.utils.jetty.JettyLogger info
INFO: jetty-6.1.x
Mar 05, 2016 11:42:49 AM com.google.apphosting.utils.jetty.JettyLogger info
INFO: Started SelectChannelConnector@127.0.0.1:8080
Mar 05, 2016 11:42:49 AM com.google.appengine.tools.development.AbstractModule startup
INFO: Module instance default is running at http://localhost:8080/
Mar 05, 2016 11:42:49 AM com.google.appengine.tools.development.AbstractModule startup
INFO: The admin console is running at http://localhost:8080/_ah/admin
Mar 05, 2016 11:42:49 AM com.google.appengine.tools.development.DevAppServerImpl doStart
INFO: Dev App Server is now running
```
