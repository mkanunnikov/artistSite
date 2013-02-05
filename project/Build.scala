import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "artistSite"
    val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
//    "leodagdag"                         % "play2-morphia-plugin_2.9.1"  % "0.0.5"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA)
    .settings(
//    resolvers ++= Seq(DefaultMavenRepository, Resolvers.githubRepository, Resolvers.morphiaRepository)
  )

/*
  object Resolvers {
    val githubRepository = "LeoDagDag repository" at "http://leodagdag.github.com/repository/"
    val morphiaRepository = "Morphia repository" at "http://morphia.googlecode.com/svn/mavenrepo/"
  }
*/
}

