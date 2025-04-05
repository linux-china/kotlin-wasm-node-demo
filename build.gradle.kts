@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec

plugins {
    kotlin("multiplatform") version "2.1.20"
}

group = "com.example"
version = "0.1.0"

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().configureEach {
    compilerOptions.freeCompilerArgs.addAll(listOf("-Xwasm-use-traps-instead-of-exceptions"))
}

kotlin {
    wasmJs {
        binaries.executable()
        nodejs()
        useEsModules()
        generateTypeScriptDefinitions()
    }

}

rootProject.the<NodeJsEnvSpec>().apply {
    version = "22.14.0"
}
