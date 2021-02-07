plugins {
    kotlin("jvm")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:_")

    testImplementation(platform("org.junit:junit-bom:_"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:_")
    testImplementation("io.mockk:mockk:_")
}
