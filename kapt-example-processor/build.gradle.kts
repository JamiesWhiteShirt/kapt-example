plugins {
    kotlin("jvm") version "1.1.3-2"
    kotlin("kapt")
}

kapt {
    correctErrorTypes = true
}

dependencies {
    compile(kotlin("stdlib"))
    compile(project(":kapt-example-core"))
    compile("com.google.auto.service:auto-service:1.0-rc2")
    kapt("com.google.auto.service:auto-service:1.0-rc2")
}

repositories {
    jcenter()
}
