plugins {
    kotlin("jvm") version "1.1.3-2"
    kotlin("kapt")
    application
}

application {
    mainClassName = "kaptexample.app.MainKt"
}

kapt {
    correctErrorTypes = true
}

dependencies {
    compile(kotlin("stdlib"))
    compile(project(":kapt-example-core"))
    compile(project(":kapt-example-processor"))
    kapt(project(":kapt-example-processor"))
}

repositories {
    jcenter()
}
