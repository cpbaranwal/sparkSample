
//import AssemblyKeys._

name := "Simple Project"

version := "1.0"

organization := "com.databricks"

scalaVersion := "2.10.4"


libraryDependencies ++= Seq(
// Spark dependency
//"org.apache.spark" % "spark-core" % "1.3.1" % "provided",
"org.apache.spark" % "spark-core_2.10" % "1.2.0" % "provided",
// Third party libraries
"net.sf.jopt-simple" % "jopt-simple" % "4.3",
"joda-time" % "joda-time" % "2.0"
)


updateOptions := updateOptions.value.withCachedResolution(true)

// This statement includes the assembly plugin capabilities
//assemblySettings

// Configure jar named used with the assembly plug-in
jarName in assembly := "my-project-assembly.jar"

// A special option to exclude Scala itself form our assembly jar, since Spark
// already bundles Scala.
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
