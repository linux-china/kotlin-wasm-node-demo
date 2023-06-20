Kotlin WebAssembly Demo in Node.js 20
==============================================

This sample leverages Kotlin/Wasm and V8 and GC, typed function references and exception handling proposals.

# Requirements

* Kotlin 1.9.0-RC
* Node.js 20.2.0

# Build and Run

```shell
$ ./gradlew wasmNodeRun
```

# Run with Node.js 20

```shell
$ cd build/js/packages/kotlin-wasm-node-example-wasm/
$ node --experimental-wasm-gc kotlin/kotlin-wasm-node-example-wasm.mjs
```

# Run with Deno

```shell
deno run --unstable -A --v8-flags=--experimental-wasm-typed-funcref,--experimental-wasm-gc kotlin-wasm-node-example-wasm.mjs
```