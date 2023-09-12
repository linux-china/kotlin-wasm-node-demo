import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    kotlin("multiplatform") version "1.9.20-Beta"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    wasmJs {
        binaries.executable()
        nodejs()
        applyBinaryen()
    }
    sourceSets {
        val wasmJsMain by getting {}
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = "20.6.1"
}
