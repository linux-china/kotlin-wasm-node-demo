import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    kotlin("multiplatform") version "1.9.0-Beta"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    wasm {
        binaries.executable()
        nodejs()
        applyBinaryen()
    }
    sourceSets {
        val wasmMain by getting {}
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = "20.2.0"
}
