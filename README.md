Kotlin WebAssembly Demo in Node.js 20
==============================================

This sample leverages Kotlin/Wasm and V8 and GC.

# Requirements

* Kotlin 2.0.0-RC2
* Node.js 22.1.0

# Build and Run

```shell
$ ./gradlew wasmNodeRun
```

# Run with Node.js 22

```shell
$ cd build/js/packages/kotlin-wasm-node-example-wasm-js/
$ node kotlin/kotlin-wasm-node-example-wasm.mjs
```

# Run with Deno 1.43

```shell
$ cd build/js/packages/kotlin-wasm-node-example-wasm-js/
$ deno run -A kotlin/kotlin-wasm-node-example-wasm-js.mjs
```

# References

* Kotlin Wasm: https://kotlinlang.org/docs/wasm-get-started.html
* Kotlin Wasm Interoperability with JavaScript: https://kotlinlang.org/docs/wasm-js-interop.html