import de.fayard.refreshVersions.bootstrapRefreshVersions

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard.refreshVersions:refreshVersions:0.9.7")
}

bootstrapRefreshVersions()

gradle.allprojects {
    group = "io.pixeloutlaw"

    repositories {
        jcenter()
    }
}

rootProject.name = "kindling"

include(
    "kindling"
)
