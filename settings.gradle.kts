rootProject.name = "kotlin-wasm-node-example"

pluginManagement {
    resolutionStrategy {
        repositories {
            mavenLocal()
            gradlePluginPortal()
            maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        }
    }
}