plugins { id("io.vacco.oss.gitflow") version "0.9.7" }

group = "io.vacco.libvirt"
version = "0.5.2"

configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, true) }

val api by configurations

dependencies {
  api("net.java.dev.jna:jna:5.8.0")
}
