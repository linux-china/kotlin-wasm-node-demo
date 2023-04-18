import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    kotlin("multiplatform") version "1.8.20"
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
    }
    sourceSets {
        val wasmMain by getting {}
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = "20.0.0-v8-canary20230417bc4174881a"
    nodeDownloadBaseUrl = "https://nodejs.org/download/v8-canary"
}

// Use a proper version of webpack, TODO remove after updating to Kotlin 1.9.
rootProject.the<NodeJsRootExtension>().versions.webpack.version = "5.76.2"
