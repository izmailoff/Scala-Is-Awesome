resolvers += Classpaths.typesafeResolver

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"        at "http://oss.sonatype.org/content/repositories/releases")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0-SNAPSHOT")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")

addSbtPlugin("com.github.scct" % "sbt-scct" % "0.2.1")
