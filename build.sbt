
name := "subtract2numbers"
version := "0.0.1"
scalaVersion := "2.13.5"
crossPaths := false
organization:="com.github.batmanwannab"
publishTo := {
  val nexus = "https://so1.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
developers := List(
  Developer(
    id = "TEAM",
    name = "TaAM",
    email = "praveshsk10@gmail.com",
    url = url("https://github.com/batmanwannab/subtract2numbers")
  )
)
publishMavenStyle := true
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
