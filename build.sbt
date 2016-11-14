name := "first_akka"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.14"
libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "2.3.14"
////libraryDependencies += "com.typesafe.akka" % "akka-util_2.11" % "2.3.14"

//
//resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers ++= Seq(
  "maven Repository" at "http://supervisor:8081/nexus/content/groups/public/"
)
//
//libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0"