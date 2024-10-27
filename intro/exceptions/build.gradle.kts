plugins {
    kotlin("jvm") version "2.0.20"
}
// Intentionally left blank
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(23)
}