// Uses the out of the box generic theme.
paradoxTheme := Some(builtinParadoxTheme("generic"))

Compile / paradoxProperties ++= Map(
  "snip.g8root.base_dir" -> "../../../../src/main/g8",
  "snip.g8src.base_dir" -> "../../../../src/main/g8/src/main/",
  "snip.g8srctest.base_dir" -> "../../../../src/main/g8/src/test/",
  "extref.akka.base_url" -> "https://doc.akka.io/docs/akka/current/%s",
  "extref.akka.http.base_url" -> "https://doc.akka.io/docs/akka-http/current/%s"
)
