import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    kotlin("multiplatform") version "2.0.20"
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
    version = "22.7.0"
}
