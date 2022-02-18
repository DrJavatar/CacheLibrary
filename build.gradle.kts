plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "com.javatar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.apache.commons:commons-compress:1.21")
    implementation("io.netty:netty-buffer:4.1.73.Final")
    implementation("com.github.jponge:lzma-java:1.3")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
}