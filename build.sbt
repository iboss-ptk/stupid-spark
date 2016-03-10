name := "stupid-spark"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core" % "1.6.0",
  "org.apache.spark"  %% "spark-yarn" % "1.6.0"
)