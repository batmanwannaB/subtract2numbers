
name := "subtract2numbers"
scalaVersion := "2.13.5"
organization:="com.github.batmanwannab"
sonatypeCredentialHost := "s01.oss.sonatype.org"
publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
credentials += Credentials("Sonatype Nexus Repository Manager",
  "s01.oss.sonatype.org",
  System.getenv("SONATYPE_USERNAME"),
  System.getenv("SONATYPE_PASSWORD"))
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
developers := List(
  Developer(
    id = "TEAM",
    name = "TaAM",
    email = "pravxxxexxx0@gmail.com",
    url = url("https://github.com/batmanwannab/subtract2numbers")
  )
)
publishMavenStyle := true
pomIncludeRepository := { _ =>
  false
}
crossPaths := false
pomExtra :=
  <url>https://github.com/batmanwannab/subtract2numbers</url>
    <scm>
      <url>https://github.com/batmanwannab/subtract2numbers</url>
      <connection>scm:git:git@github.com:batmanwannab/subtract2numbers</connection>
    </scm>
licenses := Seq(
  "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")
)

