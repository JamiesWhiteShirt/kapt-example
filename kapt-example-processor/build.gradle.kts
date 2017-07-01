plugins {
    kotlin("jvm")
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
