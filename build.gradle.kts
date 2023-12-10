plugins {
    kotlin("jvm") version "1.9.21"
    id("maven-publish")
    id("io.spring.dependency-management") version("1.1.4")
}

group = "com.josh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "maven-publish")
    dependencies {
        // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
        implementation("org.springframework.boot:spring-boot-starter:3.2.0")
        // https://mvnrepository.com/artifact/org.projectlombok/lombok
        implementation("org.projectlombok:lombok:1.18.30")

    }
}
