name := "subtract2numbers"
version := "0.0.1"
scalaVersion := "2.13.5"
crossPaths := false
organization:="com.subtract.r"
publishTo := sonatypePublishToBundle.value
developers := List(
  Developer(
    id = "TEAM",
    name = "TaAM",
    email = "praveshsk10@gmail.com",
    url = url("https://github.com/batmanwannab/subtract2numbers")
  )
)
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