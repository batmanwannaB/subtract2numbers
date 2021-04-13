
name := "subtract2numbers"
version := "0.0.3"
scalaVersion := "2.13.5"
organization:="com.github.batmanwannab"
sonatypeCredentialHost := "s01.oss.sonatype.org"
publishTo := sonatypePublishToBundle.value
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
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

