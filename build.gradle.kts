plugins {
    id("jvm.conventions")
}

val projectGroup = extra["java-dibs.group"]!!
val projectVersion: String = libs.versions.java.dibs.get()

allprojects {
    group = projectGroup
    version = projectVersion
}

subprojects {
    apply(plugin = "jvm.conventions")
}