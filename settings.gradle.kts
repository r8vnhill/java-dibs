rootProject.name = "java-dibs"

pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}
include("fp:functors:result")
include("intro:exceptions")
include("oop:anonymous")
include("oop:static")
include("testing:matchers:custom")
