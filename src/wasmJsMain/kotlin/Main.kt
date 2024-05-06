@file:OptIn(ExperimentalJsExport::class)

fun main() {
    println("Hello ${greet()}!")
}

fun greet() = "World"


@JsExport
fun welcome(name: String): String = "Welcome $name!"