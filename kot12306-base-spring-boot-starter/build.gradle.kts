plugins {
    id("java")
    kotlin("jvm") version "1.9.21"
    application
}

group = "com.josh"
version = "0.0.1"


repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {

        create<MavenPublication>("relocation") {
            artifactId = "kot12306-base-spring-boot-starter"
            from(components["java"])
            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }

            pom {
                groupId = "com.josh"
                artifactId = "kot12306-base-spring-boot-starter"
                version = "0.0.1"
                licenses {
                    license {
                        name = "The Apache License, Version 2.0"
                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }
            }
        }
    }
}

/*
uploadArchives {
    repositories{

    }
}*/
