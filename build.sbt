lazy val buildSettings = Seq(
  organization := "com.github",
  scalaVersion := "2.11.8"
)

lazy val compilerOptions = Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
//  "-Ywarn-unused-import",
  "-Ywarn-numeric-widen",
  "-Xfuture"
)

lazy val baseSettings = Seq(
  scalacOptions ++= compilerOptions, 
  scalacOptions in (Compile, console) := compilerOptions
)

lazy val allSettings = buildSettings ++ baseSettings

lazy val catsVersion       = "0.6.0"

lazy val currentVersion    = "0.0.1-SNAPSHOT"

lazy val algebra = project.in(file("."))
  .settings(allSettings)
  .settings(version := currentVersion )
  .settings(
    libraryDependencies ++= Seq(
      "org.typelevel"       %%  "cats"                % catsVersion
    )
  )
