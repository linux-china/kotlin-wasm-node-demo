@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    kotlin("multiplatform") version "2.1.0-RC2"
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

rootProject.the<NodeJsRootExtension>().apply {
    version = "22.10.0"
}
