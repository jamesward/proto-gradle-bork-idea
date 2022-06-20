import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    // idea
    application
    id("com.google.protobuf") version "0.8.18"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

application {
    mainClass.set("helloworld.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.21.1")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.20.1"
    }
}
