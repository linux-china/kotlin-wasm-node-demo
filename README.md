Kotlin WebAssembly Demo in Node.js 19
==============================================

This sample leverages Kotlin/Wasm and V8 and GC, typed function references and exception handling proposals.

# Requirements

* Kotlin 1.8
* Node.js 19+

# Build and Run

```shell
$ ./gradlew wasmNodeRun
```

# Run with Node.js 19

```shell
$ cd build/js/packages/kotlin-wasm-node-example-wasm/
$ node --experimental-wasm-gc kotlin/kotlin-wasm-node-example-wasm.mjs
```