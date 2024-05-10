import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    kotlin("multiplatform") version "2.0.0-RC3"
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
        useEsModules()
        generateTypeScriptDefinitions()
    }

}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = "22.1.0"
}
