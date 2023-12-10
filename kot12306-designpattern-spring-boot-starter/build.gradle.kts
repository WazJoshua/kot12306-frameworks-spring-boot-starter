plugins {
    id("java")
    kotlin("jvm") version "1.9.21"
    application
}

group = "com.josh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

kotlin {
    //jvmToolchain(21)
    /*sourceSets {
        val commonMain by getting {
            dependencies {
                // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
                implementation("org.springframework.boot:spring-boot-starter:3.2.0")// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
            }
        }
    }*/
}

tasks.test {
    useJUnitPlatform()
}