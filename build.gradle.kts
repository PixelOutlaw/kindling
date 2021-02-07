plugins {
    kotlin("jvm") apply false
    id("io.pixeloutlaw.gradle")
}

description = "Logging library for the JVM with no external dependencies"

subprojects {
    this@subprojects.description = rootProject.description
    this@subprojects.version = rootProject.version
}
