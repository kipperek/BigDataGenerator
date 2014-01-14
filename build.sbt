name := "scalaProj"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
   "se.radley" %% "play-plugins-salat" % "1.4.0"
)     

play.Project.playScalaSettings
