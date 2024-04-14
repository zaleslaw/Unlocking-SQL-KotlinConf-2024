plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jetbrains.kotlinx.dataframe") version "0.13.1"
}

group = "com.zaleslaw.dataframe.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.jetbrains.kotlinx:dataframe:0.13.1")
    implementation ("org.jetbrains.kotlinx:kandy-lets-plot:0.6.0")
    implementation ("org.jetbrains.kotlinx:kandy-api:0.6.0")
    implementation ("org.mariadb.jdbc:mariadb-java-client:3.1.4")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}